from pagelast.a import Friend

mylist = [Friend("윤지민", "010-1111-2222"), Friend("이선준", "010-2222-3333"),
          Friend("장지우", "010-3333-4444"),
          Friend("윤지율", "010-4444-5555"), Friend("윤지민", "010-1234-5678")]

for f in mylist:
    if f.get_name() == '장지우':
        f.set_phone("010-9999-9999")
    #if f.get_name().startswith('윤') :
           #print(f)
for f in mylist:
    print(f)



