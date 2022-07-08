from point import Point

class Circle :
    # p = point()
    def __init__(self, x, y, r):
        print("일로 온다.",x,y,r) #생성자 출력
        self.p = Point(x,y)    #Point class __init__로 감
        self.r=r

    def showInfo(self):
        self.p.showInfo()  # point class showInfo로 감
        print(f"반지름 = {self.r}")
c = Circle(2,2,4)                  #생성자 호출
c.showInfo()