import pandas as pd
from webbrowser import Konqueror
from sklearn.tree import DecisionTreeClassifier

def getModel():
    train_df = pd.read_excel('https://github.com/cranberryai/todak_todak_python/blob/master/machine_learning/regression/carprice_E1SUl6b.xlsx?raw=true', sheet_name='train')
    test_df = pd.read_excel('https://github.com/cranberryai/todak_todak_python/blob/master/machine_learning/regression/carprice_E1SUl6b.xlsx?raw=true', sheet_name='test')
    
    x_data = train_df[:].to_numpy()
    y_data = train_df['정보확인'].to_numpy()
    xtest_data = test_df[:].to_numpy()
    ytest_data = test_df['정보확인'].to_numpy()
    
    dclf = DecisionTreeClassifier()
    dclf.fit(x_data, y_data)
    
    return dclf