
SELECT*FROM EMP;

SELECT ENAME "이름", JOB "직위", DEPTNO "부서번호"
FROM EMP
WHERE DEPTNO = (SELECT DEPTNO
                      FROM DEPT
                       WHERE LOC =  'DALLAS');
                       
SELECT E.ENAME "사원명", E.SAL "급여", D.DNAME "부서명"
FROM EMP E, DEPT D
WHERE D.DEPTNO = E.DEPTNO
AND E.SAL > (SELECT SAL FROM EMP
                      WHERE ENAME = 'SMITH');
                      
SELECT ENAME, SAL, DEPTNO
FROM EMP
WHERE DEPTNO != 10
AND SAL IN(SELECT SAL FROM EMP
                                    WHERE DEPTNO = 10);
                                    
SELECT E.ENAME, E.HIREDATE 
FROM EMP E
WHERE E.ENAME != 'BLAKE'
AND E.DEPTNO = (SELECT DEPTNO FROM EMP
                             WHERE ENAME = 'BLAKE'); 
                             
SELECT EMPNO, ENAME, SAL FROM EMP
WHERE SAL > (SELECT AVG(SAL) FROM EMP)
ORDER BY SAL DESC;

SELECT EMPNO, ENAME FROM EMP 
WHERE DEPTNO IN (SELECT DEPTNO FROM EMP
                                    WHERE ENAME LIKE '%T%');
                                    
SELECT EMPNO, ENAME, SAL 
FROM EMP
WHERE SAL > (SELECT AVG(SAL) FROM EMP)
AND DEPTNO IN(SELECT DEPTNO FROM EMP
                            WHERE ENAME LIKE '%S%');
                            
SELECT ENAME, DEPTNO, SAL FROM EMP
WHERE SAL > ALL(SELECT SAL FROM EMP
                                WHERE DEPTNO= 30);
                                
SELECT DEPTNO, ENAME, JOB FROM EMP
WHERE DEPTNO = (SELECT DEPTNO FROM DEPT
                                WHERE DNAME = 'SALES');

SELECT ENAME, SAL FROM EMP
WHERE  MGR = (SELECT EMPNO FROM EMP
                            WHERE ENAME = 'KING'); 
                                    


                        
                                            