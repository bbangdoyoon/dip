import numpy as np
from sklearn.cluster import KMeans
import cv2
import matplotlib.pyplot as plt
from sklearn.linear_model import LogisticRegression


fruits = np.load('fruits_300.npy')              # 불러와라
print(fruits.shape)
fruits2d = fruits.reshape(-1, 10000)


plt.axis('off')
plt.imshow(fruits[0], cmap='gray_r')            # 저장해라
plt.savefig('pltfruits0.png')

cv2.imwrite('cvfruits0.jpg', fruits[205])         # 저장해라

km = KMeans(n_clusters=3, random_state=42)
km.fit(fruits2d)

predvalue = km.predict([fruits2d[0]])
print(predvalue)

a = cv2.imread('cvfruits0.jpg', cv2.IMREAD_GRAYSCALE)
print(a.shape)

pred = km.predict(a.reshape(-1, 10000))
print(pred)

target = np.array(['사과']*100+['파인애플']*100+['바나나']*100)
print(target.shape)
print(target[:5])
print(target[100:105])
print(target[200:205])

lr = LogisticRegression()
lr.fit(fruits2d, target)

pred = lr.predict(fruits2d[0].reshape(-1, 10000))           # 1개의 행에 10000개 의 특성(열)
print(pred)
pred = lr.predict(fruits2d[100].reshape(-1, 10000))
print(pred)
pred = lr.predict(fruits2d[200].reshape(-1, 10000))
print(pred)

pred = lr.predict(a.reshape(-1, 10000))
print(pred)