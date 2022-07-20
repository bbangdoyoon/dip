import pandas as pd   # data를 web에서 가져온다
import numpy as np
from sklearn.linear_model import Lasso  # L2규제가 있는 선형회귀
from sklearn.preprocessing import PolynomialFeatures  #항을 늘리는 것
from sklearn.preprocessing import StandardScaler # 데이터의 값을 표준점수로 변형
from sklearn.model_selection import train_test_split



data = pd.read_csv('https://bit.ly/perch_csv_data')  # data를 pandas libray에서 읽어와라
data.to_csv('perch_csv_data.csv')                    # 저장해달라 (실행시 파일 생성)
# data.to_excel('perch_xls_data.xlsx')               # excel으로 저장해라

perch_full = data.to_numpy()
perch_weight = np.array(                             # list형 자료형 타입
    [5.9, 32.0, 40.0, 51.5, 70.0, 100.0, 78.0, 80.0, 85.0, 85.0,
     110.0, 115.0, 125.0, 130.0, 120.0, 120.0, 130.0, 135.0, 110.0,
     130.0, 150.0, 145.0, 150.0, 170.0, 225.0, 145.0, 188.0, 180.0,
     197.0, 218.0, 300.0, 260.0, 265.0, 250.0, 250.0, 300.0, 320.0,
     514.0, 556.0, 840.0, 685.0, 700.0, 700.0, 690.0, 900.0, 650.0,
     820.0, 850.0, 900.0, 1015.0, 820.0, 1100.0, 1000.0, 1100.0,
     1000.0, 1000.0]
     )
weight = pd.Series('weight', perch_weight)
# data.append(weight, ignore_index=True)                # data에 append(추가한다) weight(무게)

train_input, test_input, train_target, test_target = \
    train_test_split(perch_full,perch_weight,random_state=42)

print('훈련데이터', train_input[0:3])
print('훈련데이터 타겟', train_target[0:3])
print('테스트데이터', test_input[0:3])
print('테스트데이터 타겟', test_target[0:3])

poly = PolynomialFeatures(degree=5, include_bias=False)
poly.fit(train_input)

train_poly = poly.transform(train_input)
test_poly = poly.transform(test_input)

print('훈련데이터', train_poly[0:3])
print('훈련데이터 타겟', train_target[0:3])
print('테스트데이터', test_poly[0:3])
print('테스트데이터 타겟', test_target[0:3])

ss = StandardScaler()                           #표준점수로 표기
ss.fit(train_poly)

train_scaled = ss.transform(train_poly)
test_scaled = ss.transform(test_poly)

print('훈련데이터', train_scaled[0:3])
print('훈련데이터 타겟', train_target[0:3])
print('테스트데이터', test_scaled[0:3])
print('테스트데이터 타겟', test_target[0:3])

lasso = Lasso()
lasso.fit(train_scaled, train_target)

훈련데이터점수 = lasso.score(train_scaled, train_target)
테스트데이터점수 = lasso.score(test_scaled, test_target)
print(훈련데이터점수)
print(테스트데이터점수)

예측값 = lasso.predict(train_scaled[:3])
print(예측값)
print(train_target[:3])

예측값 = lasso.predict(test_scaled[:3])          #임의의 데이터
print(예측값)
print(test_target[:3])





