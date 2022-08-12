from flask import Flask, render_template, request
import survival
import numpy as np
import pandas as pd
import cv2

app = Flask(__name__)

@app.route("/", methods=['GET', 'POST'])
def index():
    생존여부 = "데이터를 넣으세요"
    a = 2
    e = 0

    if request.method=='POST':
        sv = survival.getModel()
      
        a=request.form["a"]
        b=request.form["b"]
        c=request.form["c"]
        d=request.form["d"]
        e=request.form["e"]
        f=request.form["f"]
        g=request.form["g"]
        h=request.form["h"]
        i=request.form["i"]
                                      
        
        생존여부 = sv.predict([a, b, c, d, e, f, g, h, i])
        if 생존여부[0]  == 1:
            생존여부 = '사망.'
        else:
            생존여부 = '생존.'
         
    return render_template("index.html", 생존여부=생존여부, a=a, img ="titanic/png")



app.run(debug=True, port=5001)