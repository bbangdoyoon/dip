def doA():                          # java에서는 구현불가 yield가 없기 때문에
    print("doA 11111111")
    yield 1
    print("doA 222222222")
    yield 2
    print("doA 333333333")
    yield 3

a = doA()

print(type(a))
ret = next(a)
print('ret = ', ret)
ret = next(a)
print('ret = ', ret)
ret = next(a)
print('ret = ', ret)
next(a)
