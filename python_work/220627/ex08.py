def dosum():
    sum = 0
    for i in [1,2,3,4,5,6,7,8,9,10]: 
        sum +=i
    return sum
    #2~5까지는 dosum()의 내용
    # i = 3일때, 3+3 = 6, i = 4일 때 10+4=14 

def dosumrange():
    sum = 0
    for i in range(1,11): #1~10까지 다 적지 않고, 1~11으로 범위 설정하면 편하다.
        sum +=i
    return sum

    
result = dosum()
print('result = ', result)

result = dosumrange()
print('result = ', result)