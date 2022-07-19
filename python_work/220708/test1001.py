for i in range(3): 
    for j in[1,2,3]:
        if j!=3:
            print((i+j),",",end=" ")
        else:
            print((i+j),end=" ")
    print()

i = list(range(3))
print(i[0],i[1],i[2],sep=",",end=" ")
print()

for i in range(3):
    print(i + 1, i + 2, i + 3, sep = ',')