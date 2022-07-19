class Person:
    name=''   # << 생략가능
    def __init__(self,name): #Self는 무조건 적어야한다. 생략불가.
        self.name = name
    
    def __str__(self):  #java의 toString 
        return "Person " +self.name 