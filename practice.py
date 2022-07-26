# # print(1, 2, 3, "hello", "world!")
# print("3 + 5 = ", 3 + 5)

# print("황도윤")
# print(1+2+3+4+5+6+7+8+9+10)
# print(2*5)
# print("5-(3-1) =", 3)
# # print(10/2, 10*2)

# v1 = 25
# v2 = 30
# print(v1 + v2)
# x = 3*50
# y = x + 120
# z = y/3
# print(z)

#x = 2*2*2
#y = x/4
#z = y*y
#print(z)

# x = 100
# print(x)
# x = 3.14
# print(x)
# x = "hi~"
# print(x)

# x = 3 * 50
# x = x + 120
# x = x / 3
# print(x)

# def greet():
#     print("반갑습니다.")
#     print("파이썬의 세계로 오신 것을 환영합니다.")

# def MH():
#     print("1 + 2 + 3 + 4 + 5 = ", 1 + 2 + 3 + 4 + 5)
#     print("simple is the best!")
#     print("행복한 파이썬~")
# MH()
# def greet2(name):
#     print("반갑습니다.", name)
#     print(name,"님은 파이썬의 세계로 오셨습니다.")
# greet2("john")
# def greet2(name):
#     print("반갑습니다.", name)
#     print(name,"님은 파이썬의 세계로 오셨습니다.")
# greet2("yoon")

# def adder(num1, num2):
#     print("덧셈 결과 : ", num1 + num2)
# adder(10,5)

# def greet(name):
#     print(name)
# greet('doyoon')
# 03-1
#str1 = input("첫 번째 입력:")
#str2 = input("두 번째 입력:")
#print("두 입력의 합:", str1 + str2)

#03-2
# year = input("This year : ")
# year = eval(year)
# year = eval(input("This year :"))
# year = year +1
# print("Next year : ", year)

# rad = eval(input("radius :"))
# area = rad * rad * 3.14
# print(area)

# a = eval(input("첫 번째 입력 : "))
# b = eval(input("두 번째 입력 : "))
# print(a+b)

# result = eval(input("뭐든 넣어요 : "))
# print(result)

# sum = 0
# for i in[1,3,5,7,9]:
#     sum = sum+i
# print(sum)

# sum = 1
# for i in[1,2,3,4,5,6,7,8,9,10]:
#     sum = sum*i
# print(sum)

# sum = 7
# for i in [1,2,3,4,5,6,7,8,9]:
#     sum = 7*i
#     print("7 *",i,'=', sum)

# for i in [9,8,7,6,5,4,3,2,1]:
#     print("7 *", i, '=', 7*i)

# for i in range(0, 5):
#     print("안녕하세요")

# for i in range(1,10):
#     print("7 *", i, "=", 7*i)

# sum = 7
# for i in range(1,10):
#     sum = 7*i
#     print("7 *", i, "=", 7*i)

# def greet():
#     num = eval(input("인사를 몇 번 할까요?"))
#     for i in range(num):
#         print("안녕하세요")
# greet()   

# print(type(3))
# print(type(3.0))
# print(type(3.1))

# print(5 / 2)
# print(5 // 2)
# print(5 % 2)

# num = 10
# num = float(num)        #num의 값을 float형으로
# print(type(num))        # float이 출력 됨

# num = float("3.14") 
# print(type(num))        # 출력시 num에 저장된 값이 float형임을 밝힘

# height = eval(input("키 정보 입력 : "))
# print(height)

# height = float(input("키 정보 입력 : "))
# print(height)

# num = int(3.14)                 # 3.14를 int형으로 변환하라
# print(num)                      # 3.14실수가 아닌 정수 3이 출력된다

# height = eval(input("키 정보 cm단위로 입력 :"))         #eval 함수 호출
# print(height)

# height = int(input("키 정보 cm단위로 입력 : "))             # int함수 호출
# print(height) 

# num = 10
# num +=1             # num = num + 1을 줄인 표현
# print(num)

# def int_div(n1,n2):
#     print("몫 : ", n1 // n2)
#     print("나머지 : ", n1 % n2 )
# int_div(5,2)

# def bet_sum(n1,n2):
#     sum = 0
#     for i in range(n1+1,n2):
#         sum += i 
#     print(sum)
# bet_sum(2,5)
# bet_sum(1,5)


# st = [1, 2, 3, 4, 5]
# st[1:4] = [3]
# print(st)

# st = [1, 2, 3, 4, 5]
# st[2:] = 3, 3.5, 4 ,5
# print(st)

st = [1, 2, 3, 4, 5]
st[1:4]=[]
print(st)