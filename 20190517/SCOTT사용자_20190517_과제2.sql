
select*from emp;
select*from dept;
select*from salgrade;


select emp.ename, dept.dname ,emp.deptno,dept.dname from dept, EMP
where loc='DALLAS';


select emp.ename, dept.dname from emp,dept
where instr( emp.ename,'A')>0
and emp.deptno = dept.deptno;

select E.ename,d.dname, e.sal from emp E, dept D
where e.sal>=3000
and e.deptno = d.deptno;

select e.job, e.ename,d.dname from emp e, dept d
where e.job = 'SALESMAN'
and e.deptno = d.deptno;

select e.empno "�����ȣ",e.ename "����̸�", e.sal "����", e.sal+e.comm "�Ǳ޿�",s.grade "�޿����"
from emp e,salgrade s
where e.comm is not null
and e.sal between s.losal and s.hisal;

select e.deptno "�μ���ȣ",d.dname "�μ��̸�",e.ename "����̸�", e.sal "����",s.grade "�޿����" 
from emp e, salgrade s, dept d
where e.deptno = d.deptno
and e.deptno =10
and e.sal between s.losal and s.hisal;

--
select e.deptno  "�μ���ȣ", d.dname "�μ��̸�", e.ename "����̸�", e.sal "����", s.grade "�޿����"
from dept d, emp e, salgrade s
where e.deptno = d.deptno
and  e.deptno =10 or  e.deptno=20
and e.sal between s.losal and s.hisal; // �μ��̸��� �ߺ��� 

8.select nvl(e.ename,to_char(null,'����')) "����̸�", e.deptno"�μ���ȣ", d.dname"�μ��̸�"
from emp e, dept d;

9.select e.ename "����̸�", nvl(e.deptno,0) "�μ���ȣ", d.dname "�μ��̸�"
from emp e, dept d;

select  e.ename "����̸�", nvl(e.deptno,'����')"�μ���ȣ", d.dname "�μ��̸�"
from emp e, dept d
where e.deptno is null
or e.deptno is not null;








