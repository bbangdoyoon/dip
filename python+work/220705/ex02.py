'''
   숫자를 입력 받아서 양수이면 양수입니다. 출력
   음수이면 음수입니다. 출력

   ex)숫자 입력하세요
   5
   양수입니다.
   숫자입력하세요
   -1
   음수입니다.
   클래스와 함수를 사용해서
'''

from aa import AA

a1 = AA(100)  # 객체생성
print(a1.number)
a1.print()
a1.inputnumber()
a1.print()

a2 = AA(200)
print(a2.number)
a2.print()