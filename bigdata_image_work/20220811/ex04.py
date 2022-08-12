import cv2
import numpy as np
img = cv2.imread('20220811/white.jpg', cv2.IMREAD_COLOR)

cv2.imshow('white', img)
cv2.waitKey(0)

print(img.shape)
try:
    x = np.random.randint(0, 251, 1)
    endx = x+30
    y = np.random.randint(0, 191, 1)
    endy = y+30
    
    print(x, ' ', endx)
    print(y, ' ', endy)
    
    roi = img[30:150, 40:160]
    print(roi.shape)
    
    x = np.random.randint(0, 251, 1)
    endx = x+30
    y = np.random.randint(0, 191, 1)
    endy = y+30
    
    img[0:120, 0:120] = roi

    cv2.imshow_('white', img)
    cv2.waitKey(0)
except:
    pass