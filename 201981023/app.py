from flask import Flask, render_template, request
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
from datetime import datetime

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

@app.route('/d_day')
def d_day():
    today = datetime.now()
    finish = datetime(2019,11,27)
    remain = finish - today
    return f'우리가 같이 있을 수 있는 시간이 이제 {remain}밖에 없어'


@app.route('/naver')
def naver():
    return render_template("naver.html")

@app.route('/google')
def google():
    return render_template("google.html")

@app.route('/myday')
def myday():
    today = datetime.now()
    return render_template('myday.html', today = today)

@app.route('/ping')
def ping():
    return render_template('ping.html')

@app.route('/pong')
def pong():
    name = request.args.get('name')
    age = request.args.get('age')
    return render_template('pong.html', name=name, age=age)

@app.route('/insert')
def insert():
    return render_template('insert.html')

@app.route('/result')
def result():
    name = request.args.get('name')
    element = ['학점', '머리', '우정운', '먹을 복', '치킨복', '결혼운','취업운']
    balance = random.sample(element, k=3)
    return render_template('result.html', name=name, balance = balance)