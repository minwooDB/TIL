from flask import Flask
app = Flask(__name__)

@app.route('/')
def hello():
    return "Hello World"

@app.route('/board')
def sparta():
    return "This is sparta"

@app.route('/greeting/<string:name>')
def greeting(name):
    return f'반갑습니다. {name}님'

@app.route('/cube/<int:num>')
def cube(num):
    result = num*3
    return f'{num}의 세제곱은 {result}'

import random

@app.route('/dinner/<int:person>')
def dinner(person):
    menu = ['짜장면','김치찌개','돈까스','피자','햄버거']
    order = random.sample(menu, k=person)
    return str(order)

@app.route('/lotto')
def lotto():
    num = range(1,46)
    lotto = random.sample(num, k=6)
    return str(lotto)

@app.route('/html')
def html():
    return '<h1> This is HTML t1 tag </h1>'
