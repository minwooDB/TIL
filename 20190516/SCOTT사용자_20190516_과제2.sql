
select*from emp;

select initcap(ename)"����̸�" from emp;

select ename "����̸�", substr(ename,2,3) "2-4����" from emp;

select ename, length(ename) "����̸�" from emp;

select substr(ename,1,1), substr(ename,length(ename)) from emp;

select round(3456.78,1) from dual;

select to_char(trunc(sal*50 ,-2),'999,999,999') ||'��' "�����" from emp;

select ename,nvl2(comm,'����','����'), comm "��������" from emp;

select ename, deptno, 
            case
            when deptno=10 then 'A�μ�'
            when deptno=20 then 'B�μ�'
            when deptno=30 then 'C�μ�'
            end as "�μ���"
            from emp; 
            
select job, sal from emp
where upper(job) = 'SALESMAN'//���̺� ���� �빮�� �ҹ��� �����ؾ���
and sal>=1000;

select sysdate, sysdate+10 as after10days from dual;

select to_char(sysdate, 'yyyy"��"mm"��"dd"��"hh24"��":mi"��"ss"��"') as ����ð�
from dual; // ��¥ǥ��( YYYY �Ǵ� MM �Ǵ� DD � FM�� ���̸� ���Ŀ� ������ ���ڴ� �ּҴ����� ���EX)FMMM 8�� 9�� �� 

select ENAME "�̸�", SAL "���޿�", (SAL+200)*12 "����" from emp;

select ename, sal, 
        case 
        when sal <1000 then 'A'
        when sal >1000 and sal < 2000 then 'B'
        when sal >2000 and sal < 3000 then 'C'
        when sal >3000 and sal < 4000 then 'D'
        ELSE 'E'
        END AS "�ڵ�"
        from emp;

SELECT ENAME "�̸�", DEPTNO "�μ���ȣ",
        DECODE( deptno ,10,'A'.20, 'B',30, 'C',
        END AS "�ڵ�"
      from emp;//
      
SELECT ename || ', '|| job "Employee and Job Title" from emp;

select ename from emp
where ename like '_A%';

//select ename "�̸�", to_char(hiredate, 'yyyy"��"mm"��"dd"��"') as "�Ի���", to_char(sysdate, 'day') as "�Ի����"
from emp
oreder by to_char(hiredate-1,'D');

select ename,
            round(months_between(sysdate , hiredate),0) "months worked"
            from emp 
            order by "months worked"; //ORDAER BY 2(�ι�°���� ������ ���� �迭)

select ename "����̸�", trunc(sysdate-hiredate,0) as "�ٹ��ϼ�" from emp;

select ename, mgr, hiredate from emp
where hiredate like '1981%'
WHERE TO_CHAR(HIREDATE,'YYYY')='1981'
order by(hiredate);

select to_char(to_date(920812,'yymmdd'),'day') as "�����¾����" from dual;

select round(months_between(to_date(920812,'yymmdd'),sysdate),0) as "�¾��" from dual;

select ename, sal, comm 
 case
 when ENAME, SAL,NVL(TO_CHAR(comm) ,'����') 
 END AS Ŀ�̼�����
 from emp;
 
 select ename from emp
 where ename like 'A%' AND ENAME NOT LIKE 'N%';
 
 SELECT ENAME, HIREDATE, ROUND(HIREDATE, 'YYYY') "�ݿø���¥" FROM EMP;
 
 
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

