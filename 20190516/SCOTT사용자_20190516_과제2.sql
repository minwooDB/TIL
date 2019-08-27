
select*from emp;

select initcap(ename)"사원이름" from emp;

select ename "사원이름", substr(ename,2,3) "2-4문자" from emp;

select ename, length(ename) "사원이름" from emp;

select substr(ename,1,1), substr(ename,length(ename)) from emp;

select round(3456.78,1) from dual;

select to_char(trunc(sal*50 ,-2),'999,999,999') ||'원' "계산결과" from emp;

select ename,nvl2(comm,'설정','미정'), comm "설정여부" from emp;

select ename, deptno, 
            case
            when deptno=10 then 'A부서'
            when deptno=20 then 'B부서'
            when deptno=30 then 'C부서'
            end as "부서명"
            from emp; 
            
select job, sal from emp
where upper(job) = 'SALESMAN'//테이블 값은 대문자 소문자 구분해야함
and sal>=1000;

select sysdate, sysdate+10 as after10days from dual;

select to_char(sysdate, 'yyyy"년"mm"월"dd"일"hh24"시":mi"분"ss"초"') as 현재시간
from dual; // 날짜표기( YYYY 또는 MM 또는 DD 등에 FM을 붙이면 이후에 나오는 문자는 최소단위로 출력EX)FMMM 8월 9월 등 

select ENAME "이름", SAL "월급여", (SAL+200)*12 "연봉" from emp;

select ename, sal, 
        case 
        when sal <1000 then 'A'
        when sal >1000 and sal < 2000 then 'B'
        when sal >2000 and sal < 3000 then 'C'
        when sal >3000 and sal < 4000 then 'D'
        ELSE 'E'
        END AS "코드"
        from emp;

SELECT ENAME "이름", DEPTNO "부서번호",
        DECODE( deptno ,10,'A'.20, 'B',30, 'C',
        END AS "코드"
      from emp;//
      
SELECT ename || ', '|| job "Employee and Job Title" from emp;

select ename from emp
where ename like '_A%';

//select ename "이름", to_char(hiredate, 'yyyy"년"mm"월"dd"일"') as "입사일", to_char(sysdate, 'day') as "입사요일"
from emp
oreder by to_char(hiredate-1,'D');

select ename,
            round(months_between(sysdate , hiredate),0) "months worked"
            from emp 
            order by "months worked"; //ORDAER BY 2(두번째꺼를 차순에 따라 배열)

select ename "사원이름", trunc(sysdate-hiredate,0) as "근무일수" from emp;

select ename, mgr, hiredate from emp
where hiredate like '1981%'
WHERE TO_CHAR(HIREDATE,'YYYY')='1981'
order by(hiredate);

select to_char(to_date(920812,'yymmdd'),'day') as "내가태어난요일" from dual;

select round(months_between(to_date(920812,'yymmdd'),sysdate),0) as "태어난지" from dual;

select ename, sal, comm 
 case
 when ENAME, SAL,NVL(TO_CHAR(comm) ,'미정') 
 END AS 커미션정보
 from emp;
 
 select ename from emp
 where ename like 'A%' AND ENAME NOT LIKE 'N%';
 
 SELECT ENAME, HIREDATE, ROUND(HIREDATE, 'YYYY') "반올림날짜" FROM EMP;
 
 
SELECT SUM(SAL) FROM EMP;

SELECT SUM (DISTINCT SAL) FROM EMP;

SELECT COUNT(DISTINCT SAL) FROM EMP;
SELECT COUNT(SAL) FROM EMP;

SELECT MAX(COMM) FROM EMP;

SELECT MIN(SAL) FROM EMP
WHERE DEPTNO=30 OR DEPTNO=10;

SELECT ROUND(AVG(SAL),1) FROM EMP
WHERE DEPTNO=10;

@C:\SQL\scott_db.sql;
select*from emp;

select*from course1
intersect
select*from course2;


select*from course1
union 
select*from course2
order by age;

select*from course1
minus
select*from course2;

select*from course2
minus
select*from course1
order by name;

select*from emp,dept;
order by empno;

insert into emp values 
        (7940,'marry',clerk, 7782.'1995-05-13',1000,null,null);
commit;

select EMP.ename,emp.JOB from DEPT, EMP
where 
where loc='DALLAS';

