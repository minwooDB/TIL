from flask import Flask, render_template, request
import requests
from decouple import config
from pprint import pprint as pp

app = Flask(__name__)

base = "https://api.telegram.org"
token = config('TOKEN')

@app.route('/')
def write():
     return render_template('write.html')

@app.route('/send')
def send():
    method = 'getUpdates'

    url = f'{base}/bot{token}/{method}'
    res = requests.get(url).json()
    #http에서 가져오는 값
    print(res)
    #pp(res)

    #받아온 응답(json)을 dictionary로 바꿔서 첫번째 메시지의 chat_id를 가져온다.
    chat_id =res['result'][0]['message']['chat']
    print(chat_id)
    method = 'sendMessage'
    text = request.args.get('msg')
    #request => flask에 내장된 내용 가져오기
    print(text)
    url = f'{base}/bot{token}/{method}?chat_id={chat_id}&text={text}'

    requests.get(url)
    return '전송완료'
