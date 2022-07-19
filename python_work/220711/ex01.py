from accumulator import Accumulator
# from psutil import AccessDenied


# a ='''
# from Accumulator import Accumulator

# for i in range(1,10):
#     Accumulator.add(i)

# Accumulator.showResult()

# '''
#print(a)
acc = Accumulator()
for i in range(1,10):
    acc.add(i)
acc.showResult()