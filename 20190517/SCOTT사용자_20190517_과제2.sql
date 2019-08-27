
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

select e.empno "사원번호",e.ename "사원이름", e.sal "연봉", e.sal+e.comm "실급여",s.grade "급여등급"
from emp e,salgrade s
where e.comm is not null
and e.sal between s.losal and s.hisal;

select e.deptno "부서번호",d.dname "부서이름",e.ename "사원이름", e.sal "월급",s.grade "급여등급" 
from emp e, salgrade s, dept d
where e.deptno = d.deptno
and e.deptno =10
and e.sal between s.losal and s.hisal;

--
select e.deptno  "부서번호", d.dname "부서이름", e.ename "사원이름", e.sal "월급", s.grade "급여등급"
from dept d, emp e, salgrade s
where e.deptno = d.deptno
and  e.deptno =10 or  e.deptno=20
and e.sal between s.losal and s.hisal; // 부서이름이 중복됨 

8.select nvl(e.ename,to_char(null,'미정')) "사원이름", e.deptno"부서번호", d.dname"부서이름"
from emp e, dept d;

9.select e.ename "사원이름", nvl(e.deptno,0) "부서번호", d.dname "부서이름"
from emp e, dept d;

select  e.ename "사원이름", nvl(e.deptno,'미정')"부서번호", d.dname "부서이름"
from emp e, dept d
where e.deptno is null
or e.deptno is not null;








