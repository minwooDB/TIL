show user;
select * from tab;
  
DESC emp;
DESC BONUS;
DESC SAL_GRADE;
DESC DEPT;


select ename, empno,sal FROM emp;

select distinct salary from employees;

select distinct sal from emp;

//6��
select ename, "�̸�"  FROM emp;
select sal, "����"  FROM emp;



select ename, sal , SAL+comm "�Ǳ޿�" FROM EMP
where comm is not null;
 

SELECT empno, ename, sal FROM EMP
WHERE ename='SCOTT';

SELECT * 
FROM emp 
where empno in (7499, 7521, 7654);

SELECT empno, ename, job
FROM emp
where job = 'SALESMAN';

SELECT *
FROM EMP
WHERE sal BETWEEN 1500 AND 3000;

SELECT deptno FROM emp 
WHERE deptno IS NULL ;

SELECT 
*FROM emp 
order by SAL;

select ename, hiredate from emp
order by hiredate desc;

select ename from emp
where deptno = 30
order by hiredate;

select round(1234.5678) as round,
            round(1234.5678,0) as round_0,
            round(1234.5678,1) as round_1,
            round(1234.5678,-1) as round_minus1,
            round(1234.5678,-2) as round_minus2    
from dual;

select trunc(1234.5678) as trunc,
            trunc(1234.5678,0) as trunc_0,
            trunc(1234.5678,1) as trunc_1,
            trunc(1234.5678,-1) as trunc_minus1,
            trunc(1234.5678,-2) as trunc_minus2    
from dual;

select 
            mod(15,6),
            mod(10,2)
from dual;

select empno, ename, hiredate,
            add_months(hiredate,240) as work20year
from emp;

select empno, ename, hiredate, sysdate
from emp
where add_months(hiredate,12) >sysdate;

select empno, hiredate, sysdate,
trunc( months_between(sysdate, hiredate)) as months1 from emp;

select to_char(sysdate, 'yyyy/mm/dd ht:mi') as ���糯¥�ð�,
            to_char(sysdate, 'yyyy/mm/dd hh24:mi:ss') as ���糯¥�ð�1;
          
select to_char(sysdate, 'mm') as ���糯¥�ð�2,
            to_char(sysdate, 'mon') as ���糯¥�ð�3,
            to_char(sysdate, 'month') as ���糯¥�ð�4,
            to_char(sysdate, 'dd') as ���糯¥�ð�5
            from dual; 

select sal,
            to_char(sal, '099,999,999');
            

create table imsi( name varchar2(30), birthday date);

insert into imsi values('��浿', sysdate);
insert into imsi values('�Ѹ�1',to_date('88-03-10', 'yy-mm-dd'));
insert into imsi values('�Ѹ�2',to_date('88-03-10', 'rr-mm-dd'));
insert into imsi values('��ġ1',to_date('33-03-10', 'yy-mm-dd'));
insert into imsi values('��ġ2',to_date('33-03-10', 'rr-mm-dd'));

select name, to_char(birthday, 'yyyy-mm-dd') from imsi;

select ename, comm form emp;

select ename, comm form emp; // "����"

select ename, nvl(comm, "����") from emp;

