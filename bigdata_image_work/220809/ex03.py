import numpy as np

a = np.zeros((3, 3))
b = np.ones((4, 4))
c = np.full((5, 5), 10)


def doA(*a):
    print(a)
    print(*a)
print(a)
print(b)
print(c)

doA(3, {"aa","bb",})
doA((3, 3))