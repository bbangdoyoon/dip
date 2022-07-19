import won as w1

import pandas as pd
import numpy as np

result = np.random.rand(10)
print(f"랜덤 값 나옵니다.{result}")
result = w1.areawon(3)

num = float(input("반지름입력"))
print(f"넓이는 = {result}")
result = w1.cwon(2)
print(f"둘레는 = {result}")