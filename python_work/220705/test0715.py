def main():
    num = int(input("정수 입력"))
    if num < 0:
        print(num,"은 0보다 작습니다.")
    if num > 0 or num < 10:
        print(num,"은 0이상 10미만입니다.")
    elif num > 10 or num < 20:
        print(num,"은 10 이상 20미만입니다.")
    elif num > 20 :
        print(num,"은 20 이상입니다.")
main()