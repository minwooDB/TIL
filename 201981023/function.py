#함수의 종류

#1. 인자와 리턴
  def sum_ex(a,b)
#2. 리턴만
#3. 인자만
def say(name,age):
    print(f'제 이름은 {name}이고 {age}살입니다.')
#4. 인자와 리턴 x
def say():
    print('안녕하세요')
    say()
    result = say()
    print(result)

    #함수의 인자
    #1. 위치인자(Positional Argument)

    def my_func(a,b,c):
        print(f'첫번째는{a}, 두번째는 {b}, 세번째는 {c}')
        return a + b + c

        result = my_func(1,2,3)
        print(result)
    
    #2. 기본값 인자(default argument)
    def greeting(name='juan'):
        print(f'{name}님 안녕하세요')
    
        greeting()
        greeting('bob'

    )
        def my_sum(a,b=2):
            return a+b
            print(my_sum(2))
            print(my_sum(2,4))

    
    #키워드 인자

        def greeting(age,name= 'juan'):
            print(f'{name}은 {age}살 입니다.')

        #greeting(19)
        greeting(19)
        greeting(19,'justin')
        greeting(name ='john', 'age'= 33)
        greeting(name ='eric', 'age'= 19)
        greeting(19, name = 'eric')

    # 4. 가변인자
        def my_func(*args):
        pring(agrs)
        pring(type(args))
        return args

        my_func(1,2,3)
        my_func(1,2,3,4)
        my_func(1,2,3,4,5)

        def my_dict
        print(type)

jumin1 = '900101-1020201'
jumin2 ='910203-2030020 '

         def male_female(number):
             if number[7]== '1':
                 prin('남자입니다')
            else:
                pass('여자입니다.')


#2 사용자의 입력으로 숫자를 받아서 해당 숫자가 짝수인지 홀수인지 구분
 num = int(input('숫자를 입력해주세요:'))
 def even_odd(num):
     if num %2:
         print('홀수입니다')
    else:
        print('짝수입니다.')
    even_odd(num)


#리스트 안에서 가장 작은 숫자를 출력하는 함수
items = [1,2,-5,0]
def smallest_num(items):
    min_num = items[0]
for item in item:
    if item < min_num:
        min_num = item
return min_num
pring(smallest_num(items)


words = ['level','asder','tomato','abdda','s']
def count_word(word):
 count = 0
 for word in word
    if len(word)>=2 and word[0] == word[-1]:
        count += 1
    return count


import requests
from bs4 import BeautifulSoup

    res = requests.get("https://finance.naver.com/marketindex/")
    soup = BeautifulSoup(res.content, 'html.parser')
    #exchangeList > li.on > a.head.usd > div > span.value
    exchangeList = soup.select_one('#exchangelist > li.on > a.head.usd > div > span.value')
    print ('지금 원/달러 환율은 '+ exchangeList.text)
    
    html.close() # urlopen을 진행한 후에는 close를 한다.

'''
    class Person:
        name = '아이유'
        def say_hello(self):
            print(f'hello! {self.name}')
#클래스 -> 인스턴스
iu = Person()
#인스턴스를 통해 메서드를 호출
iu.say_hello() 
#인스턴스를 통해 속서에 접근
print(iu.name)
#클래스를 통해 속성에 접근
print(Person.name)
# 클래스를 통해 메서드 호출
print(Person.say_hello(iu))

iu.name = 'momo'
#print(iu.name)
print(Person.name)
'''
'''
class Person:
    name = '아이유'
    age = '27'

    def greeting(self):
        print(f'안녕하세요. 저는 {self.name}입니다. 제 나이는 {self.age}입니다')
    
    print(iu.name)
    print(iu.age)
    '''
'''
class Person:
    name = '홍길동'
        def greeting(self):
            print(f'{name}')
    p1 = Person()
    print(p1.name)
    print(Person.name)

    p1.name = '아이유'
    print(p1.name)
    print(Person.name)

'''
'''
class = Something:
    word = 'Class member'

    def Set(self,msg):
        self.word = msg

    def Print(self):
        print(word)

    g = Something()
    g.Set('First Message')
    g.Print()

'''

class Person:
    def__init__(self, name): 
        print(f'하이{name}')
    def__del__(self):
        print('하이')
hong = Person('hong')

class Myclass:
    def__init__(self, name): 
        print(f'하이{name}')
    def__del__(self):
        print('하이')
hong = Person('hong')


class Person:
    