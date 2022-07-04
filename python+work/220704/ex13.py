# p109
# 문제4
# 빈 리스트를 만들어서 그 안에 1부터 10까지 넣었다가, 다시 1부터 10까지 꺼내는(삭제하는)코드를 만들어보자.
# 다느 이번에는 넣고 꺼내야 할 값이 많으니 for루프를 이용하는 형태로 코드를 작성해보자.
st=[]
print(st)
for i in range(0,10):
    st.append(i+1)
print(st)

for i in range(0,10):
    st.pop(-1)
print(i)

