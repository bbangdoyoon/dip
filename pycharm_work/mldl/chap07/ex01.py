from tensorflow import keras                                # tensorflow의 keras패키지를 가져와 사용하겠다.
from sklearn.linear_model import SGDClassifier              #sklearn.linear_model에 있는 SGDClassifier을 가져와 쓰겠다.
import matplotlib.pyplot as plt
import numpy as np

(train_input, train_target),(test_input, test_target) = keras.datasets.fashion_mnist.load_data()        # keras에 dataset을 가져왔다.

print(train_input[0])
print(train_input.shape)                                                                                # train_input 값이
print(train_target.shape)                                                                               # train_target 값이
train_input = train_input.reshape(-1, 784)
test_input = test_input.reshape(-1, 784)
train_scaled = train_input / 255.0
test_scaled = test_input / 255.0
print(np.round(train_scaled[0].reshape(28, 28), decimals=3))

sgd = SGDClassifier(loss='log', max_iter=5, random_state=42)
sgd.fit(train_scaled, train_target)                                     # 훈련시켜라

훈련점수 = sgd.score(train_scaled, train_target)
테스트점수 = sgd.score(test_scaled, test_target)
print(훈련점수)
print(테스트점수)

plt.imshow(train_input[0].reshape(28, 28), 'gray_r',vmax=1)
plt.show()                                                              # train_input[0].reshape(28, 28)를 출력해라

plt.imshow(train_scaled[0].reshape(28, 28), 'gray_r')
plt.show()                                                              # train_scaled[0].reshape(28, 28))를 출력해라

# 0.티셔츠, 1.바지, 2.스웨터, 3.드레스, 4.코트, 5.샌달, 6.셔츠, 7.스니커즈, 8.가방, 9.앵글부츠
pred = sgd.predict(train_scaled[0].reshape(-1, 784))
print(pred)
pred = sgd.predict(train_scaled[1].reshape(-1, 784))
print(pred)

plt.imshow(train_scaled[1].reshape(28, 28), 'gray_r')
plt.show()

print(np.round(train_scaled[1].reshape(28, 28), decimals=2))            # decimals = 2 는 소수점 둘째 자리까지

mydata = np.random.rand((784))
print(mydata.shape)
print(mydata)

mydata = mydata.reshape(28, 28)
mydata[:14, 0] = 0
mydata[:13, 1] = 0
mydata[:12, 2] = 0
mydata[:11, 3] = 0
mydata[:10, 4] = 0
mydata[:9, 5] = 0



plt.imshow(mydata, cmap='gray_r')

plt.show()

pred = sgd.predict(mydata.reshape(-1, 784))
print(pred)



























