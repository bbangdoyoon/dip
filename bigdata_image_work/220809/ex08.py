import numpy as np
import matplotlib.pyplot as plt

img = np.random.randint(0, 255, size=512*512*3).reshape(-1, 512, 3)
print(img.shape)

myfilter = np.full((100, 100, 3), [0, 120, 100])

print(myfilter.shape)

plt.imshow(img, cmap='gray_r')
plt.show()

img[100:200, 200:300] = [255, 0, 0]
img[100:200, 200:300] = img[100:200, 200:300]+myfilter

plt.imshow(img, cmap='gray_r')
plt.show()