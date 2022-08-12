from flask import Flask, render_template, request
import car
import numpy as np
import pandas as pd

app = Flask(__name__)

@app.route("/", methods=['GET', 'POST'])
def index():
   if request.method=="POST":
      CP = car.getModel()
      a = request.form['a']
      b = request.form['b']
      c = request.form['c']
      d = request.form['d']
      e = request.form['e']
      f = request.form['f']
      g = request.form['g']
      h = request.form['h']
      i = request.form['i']
      j = request.form['j']
      
      
      정보확인 = CP.predict([[a, b, c, d, e, f, g, h, i, j, ]])
      if 정보확인[0] == 1:
         정보확인 = '확인가능'
      else:
         정보확인 = "확인불가능"
   return render_template("index.html")

app.run(debug=True,port=5001)