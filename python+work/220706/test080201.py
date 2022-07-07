def main():
    lcm = 0
    n = 45

    while True : 
        if n%6 == 0 and n%45 == 0:
            print( lcm, "나눠지는 값", n, end='')
            lcm = n
            break
        n = n+1
main()
