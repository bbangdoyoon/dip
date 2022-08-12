import cv2

img = cv2.imread('20220811/white.jpg', cv2.IMREAD_COLOR)
print(img.shape)

for i in range(0, 280, 10):
    img[:, :i]=[255, 255, 0]
    cv2.imshow('white', img)
    a = cv2.waitKey(100)
    print(a)
cv2.imwrite('white_copy.jpg', img)

img = cv2.imread('20220811/white.jpg', cv2.IMREAD_COLOR)
img_gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
print(img_gray.shape)
cv2.imshow('white', img_gray)
cv2.waitKey(0)
cv2.imwrite('white_gray.jpg', img_gray)