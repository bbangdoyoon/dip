def doA(a=10):
    print(a)


for i in[1,2,3,4,]:
    print(i,end='_')

print() #()속에 (end='\n')이 숨어있어서 줄바꿈
for i in[1,2,3,4,]:
    print(i,end='\n')

doA()
doA(20)
