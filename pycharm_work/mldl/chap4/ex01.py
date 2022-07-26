import pandas as pd                                 #data를 web에서 가져온다
import numpy as np
from sklearn.neighbors import KNeighborsClassifier
from sklearn.preprocessing import StandardScaler    #data의 값을 표준점수로 변형
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LogisticRegression
import matplotlib.pyplot as plt
from scipy.special import expit
from sklearn.ensemble import RandomForestClassifier


data = pd.read_csv('https://bit.ly/fish_csv_data')  #data를 pands libray에서 읽어와라
data.to_excel('fish_data.xlsx')                     #excel으로 저장해라

print(data.head())
fish_data = data[['Weight', 'Length', 'Diagonal', 'Height', 'Width']].to_numpy() # [[ ]]안의 data를 numpy로...
print(fish_data[:5])
fish_target = data['Species'].to_numpy()
print(fish_target[:5])

train_input, test_input, train_target, test_target \
    = train_test_split(fish_data, fish_target, random_state=42)

ss = StandardScaler()                               #표준점수로 변환
ss.fit(train_input)

train_scaled = ss.transform(train_input)
test_scaled = ss.transform(test_input)

print(train_scaled[:5])
print(train_target[:5])
print(test_scaled[:5])
print(test_target[:5])

knclf = KNeighborsClassifier(n_neighbors=3)         #학습기 선언, 이웃되는 좌표 3개만 보는 좌표
knclf.fit(train_scaled, train_target)               #학습기로 학습을 진행

예측값 = knclf.predict(test_scaled)                  # 예측을 진행
print(예측값[:5])
print(test_target[:5])

pre = [[242, 25.4, 30.0, 11.52, 4.02],
       [363, 29.0, 33.5, 12.73, 4.4555]]      # Bream data를 pre라는 변수에 넣음
pre_scaled = ss.transform(pre)

print(pre_scaled)
pre_value = knclf.predict(pre_scaled)
print(pre_value)                                # 확인시 parkki bream이 나옴

score = knclf.score(test_scaled, test_target)
print(score)

z = np.arange(-5, 5, 0.1)
phi = 1 / (1+np.exp(-z))
print(z)
print(phi)

plt.plot(z, phi)
plt.show()

indexs = (train_target =='Bream')|(train_target =='Smelt')
print(indexs)
도미빙어데이터 = train_scaled[indexs]
도미빙어타겟 = train_target[indexs]

print(도미빙어데이터.shape)
print(도미빙어타겟.shape)

lr = LogisticRegression()
lr.fit(도미빙어데이터, 도미빙어타겟)

indexs = (test_target =='Bream')|(test_target =='Smelt')
도미빙어데이터 = test_scaled[indexs]
도미빙어타겟 = test_target[indexs]

score = lr.score(도미빙어데이터, 도미빙어타겟)
print(score)

pre = [[242, 25.4, 30.0, 11.52, 4.02], [363, 29.0, 33.5, 12.73, 4.4555]]
pre_scaled = ss.transform(pre)

pre_value = lr.predict(pre_scaled)
print(pre_value)

z = lr.decision_function(도미빙어데이터)
print(z)

phi = 1/(1+np.exp(-z))
print(phi)

phi = expit(z)
print(phi)

훈련데이터점수리스트 = []
테스트데이터점수리스트 = []

for i in range(1, 100):
    lr = LogisticRegression(C=i, max_iter=1000)          #L2규제는 제곱을 규제한다. C=규제  기본값은 1, 클수록 완화
    lr.fit(train_scaled, train_target)  #모든 데이터로 학습

    훈련데이터점수 = lr.score(train_scaled, train_target)
    테스트데이터점수 = lr.score(test_scaled, test_target)

    훈련데이터점수리스트.append(훈련데이터점수)
    테스트데이터점수리스트.append(테스트데이터점수)

print(훈련데이터점수리스트)                   #출력하니 규제 강도가 1일때 0.85
print(테스트데이터점수리스트)
print(np.argmax(훈련데이터점수리스트))        #np.argmax 몇 번째가 가장 큰가를 찾는 함수
print(np.argmax(테스트데이터점수리스트))

plt.plot(range(1, 100), 훈련데이터점수리스트)
plt.plot(range(1, 100), 테스트데이터점수리스트)
plt.show()

pre = [[242, 25.4, 30.0, 11.52, 4.02],
       [363, 29.0, 33.5, 12.73, 4.4555],
       [1000, 40, 43.5, 12.354, 6.525]]
pre_scaled = ss.transform(pre)

pre_value = lr.predict(pre_scaled)
print(pre_value)

lgb = RandomForestClassifier()
lgb.fit(train_scaled, train_target)

훈련데이터점수 = lgb.score(train_scaled, train_target)
테스트데이터점수 = lgb.score(test_scaled, test_target)

print(훈련데이터점수리스트)
print(테스트데이터점수리스트)

pre = [[242, 25.4, 30.0, 11.52, 4.02],
       [363, 29.0, 33.5, 12.73, 4.4555],
       [1000, 40, 43.5, 12.354, 6.525]]
pre_scaled = ss.transform(pre)

pre_value = lgb.predict(pre_scaled)
print(pre_value)

#회귀에서는 mse함수
#분류에서는 log함수




