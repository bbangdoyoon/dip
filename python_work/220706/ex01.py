from car import Car

def main():
    c1 = Car()   #Car라는 객체를 c1로 보고 내용은speed
    print('main')
    while True:
        print("1. 속도입력")
        print("2. 속도출력")
        select = int(input())
        if select == 1:
            speed = input("속도를 입력하세요")
            c1.speed = speed
        else:
            print("속도 = ", c1.speed)
main()





   