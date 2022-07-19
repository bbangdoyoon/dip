from openpyxl import Workbook
import numpy as np

wb = Workbook()  #새로운xlsx
ws = wb.active   #워크시트

inndex = 1
for r in range(1,11):
    for c in range(1,11):
        ws.cell(row=r,column=c).value = np.random.randint(0,100) # 0~100 랜덤하게 밸류에 넣어달라

wb.save('b.xlsx')
wb.close()