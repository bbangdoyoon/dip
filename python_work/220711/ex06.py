a = 0
a += 1

def funcA():
    print(a)

def funcLocalA(n): #지역변수  7~8안에서만 적용 호출 불가능
    print(n)

funcA()
funcLocalA(10)
print(a)