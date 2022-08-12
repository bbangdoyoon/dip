import pandas as pd
from sklearn.tree import DecisionTreeClassifier


def getModel():
    train_df = pd.read_excel('https://github.com/cranberryai/todak_todak_python/blob/master/machine_learning/binary_classification/%E1%84%90%E1%85%A1%E1%84%8B%E1%85%B5%E1%84%90%E1%85%A1%E1%84%82%E1%85%B5%E1%86%A8_b0fdSDZ.xlsx?raw=true', sheet_name='train')
    test_df = pd.read_excel('https://github.com/cranberryai/todak_todak_python/blob/master/machine_learning/binary_classification/%E1%84%90%E1%85%A1%E1%84%8B%E1%85%B5%E1%84%90%E1%85%A1%E1%84%82%E1%85%B5%E1%86%A8_b0fdSDZ.xlsx?raw=true', sheet_name='test')
    
    
    x_data = train_df.iloc[:,1:-1].to_numpy()
    y_data = test_df['생존여부'].to_numpy()
    xtest_data = test_df.iloc[:,1:-1].to_numpy()
    ytest_data = test_df('생존여부').to_numpy()
    
    dclf = DecisionTreeClassifier()
    dclf.fit(x_data, y_data)
    
    return dclf