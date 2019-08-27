show user;
select * from tab;
  
DESC emp;
DESC BONUS;
DESC SAL_GRADE;
DESC DEPT;


select ename, empno,sal FROM emp;

select distinct salary from employees;

select distinct sal from emp;

//6번
select ename, "이름"  FROM emp;
select sal, "월급"  FROM emp;



select ename, sal , SAL+comm "실급여" FROM EMP
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

