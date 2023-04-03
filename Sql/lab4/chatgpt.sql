SELECT e.ename employe, s.ename sup, LOC, grade
FROM emp e 
JOIN dept 
USING(DEPTNO)
JOIN salgrade
LEFT JOIN emp s
ON s.EMPNO = e.MGR
WHERE e.SAL BETWEEN LOSAL AND HISAL;

SELECT e.ename, s.ename
FROM emp e
LEFT JOIN emp s
ON s.empno = e.mgr
WHERE s.ename IS NULL;

SELECT ename, dname, grade, COUNT(*)
FROM emp
JOIN dept
USING(deptno)
JOIN salgrade
ON (sal BETWEEN losal AND hisal 
AND grade = 3)
GROUP BY ename;

SELECT e.ename, d.dname, s.grade
FROM emp e
JOIN dept d ON e.deptno = d.deptno
JOIN salgrade s ON e.sal BETWEEN s.losal AND s.hisal
WHERE s.grade = 3;

SELECT e.ename
FROM emp e
JOIN emp e2 ON e.MGR = e2.mgr
WHERE e2.ENAME = "blake";

SELECT SUM(SAL) AS "Salaire Total"   
FROM emp
JOIN dept
USING(deptno)
WHERE dname = "RESEARCH";

SELECT ename AS "nom",loc AS "lieux"
FROM emp
RIGHT join dept
USING(deptno);