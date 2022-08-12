import matplotlib.pyplot as plt
from sklearn.decomposition import PCA
import numpy as np
from sklearn.linear_model import LogisticRegression


fruits = np.load('fruits_300.npy')
fruits2d = fruits.reshape(-1, 10000)                    # -1는 끝까지

pca = PCA(n_components=0.5)                              # 차원을 50개로 줄인다
pca.fit(fruits2d)                                       # 학습해라

print(pca.components_.shape)                            #

fruits_pca = pca.transform(fruits2d)
print(fruits_pca.shape)

fruits_inverse_pca = pca.inverse_transform(fruits_pca)
print(fruits_inverse_pca.shape)

def draw_fruits(arr, ratio=1):
    n =len(arr)
    print('n = ', n)
    rows = int(np.ceil(n/10))
    print('rows = ', rows)
    cols = n if rows <2 else 10
    print('cols = ', cols)
    _, axs = plt.subplots(rows, cols, squeeze=False)
    for i in range(10):
        for j in range(10):
            if i*10 + j < n:
                axs[i, j].imshow(arr[i*10+j], cmap='gray_r')
                axs[i, j].axis('off')
    plt.show()

# draw_fruits(pca.components_.reshape(-1, 100, 100))
# draw_fruits(fruits_pca.reshape(-1, 5, 10)[:100])
# draw_fruits(fruits_inverse_pca.reshape(-1, 100, 100)[:100])
# draw_fruits(fruits_inverse_pca.reshape(-1, 100, 100)[100:200])
# draw_fruits(fruits_inverse_pca.reshape(-1, 100, 100)[200:300])
#
plt.scatter(fruits_pca[:100, 0], fruits_pca[:100, 1])
plt.scatter(fruits_pca[100:200, 0], fruits_pca[100:200, 1])
plt.scatter(fruits_pca[200:300, 0], fruits_pca[200:300, 1])
plt.legend(['apple', 'pineapple', 'banana'])
plt.show()
#
# target = np.array(['apple']*100+['pineapple']*100+['banana']*100)
#
# lr = LogisticRegression()
# lr.fit(fruits_pca, target)
#
# pred = lr.predict(fruits_pca[0].reshape[-1:100])
# print(pred)
# pred = lr.predict(fruits_pca[100].reshape[-1:100])
# print(pred)
# pred = lr.predict(fruits_pca[200].reshape[-1:100])
# print(pred)
#
