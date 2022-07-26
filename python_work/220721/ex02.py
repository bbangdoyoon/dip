import sys

def doA():                                                          # generator 함수
    yield from [10,20,30,40,50,60,70,80,90,100,110,120,130,140]     # 한 개씩 반환이 되도록

a = [10,20,30,40,50,60,70,80,90,100,110,120,130,140]                # 배열 선언
b = doA()

print(sys.getsizeof(a))                                             #
print(sys.getsizeof(b))

print(next(b))
print(next(b))
print(next(b))