from flask import Flask

app = Flask(__name__)

@app.route("/")
def ineex():
    return  '''<!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
            <style>
                p::first-letter{font-size: 3em;}
                p::first-line{color:red}
            </style>
        </head>
        <body>
            <h1>doyoon</h1>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Doloremque illo, non consectetur aliquid recusandae neque magnam excepturi molestiae minima facere! Ratione consectetur in tempora, porro incidunt distinctio nostrum voluptates tempore?</p>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Quia unde facilis nihil commodi reiciendis ut assumenda debitis modi. Ad explicabo, temporibus praesentium debitis eum esse perferendis quo blanditiis repellat ea.</p>
        </body>
        </html>''' 

app.run(host="192.168.0.47",port=5000)