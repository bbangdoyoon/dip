st = "The Espress spirit"
cnt = 0
for i in st:
    if i =='E':
        print(i)
        print(cnt)
    cnt+=1
print(st.find('E'))

myst = "한글입니다.\n잘되네요."
print(myst)
myst = "한글입니다.\t잘되네요."
print(myst)
myst = "한글입니다.\"잘되네요."
print(myst)
myst = "한글입니다.\'잘되네요."
print(myst)

mylist=[1,2,3,4,5]
del mylist[3:]  # [3]부터 그 뒤까지 모두 삭제 
print(mylist)

del mylist[:]   # 리스트에 저장된 값 모두 삭제
print(mylist)