#2 - Affichez le numéro de l’employé, le nom, le salaire, le numéro du
#département et le lieu des employés du département 10 ou les employés dont le
#salaire mensuel est supérieur à 1500 $.;

SELECT EMPNO, ENAME, SAL, emp.DEPTNO, LOC
FROM emp,dept
WHERE dept.deptno = emp.deptno
AND (emp.DEPTNO = 10
OR SAL > 1500);


#toujours faire la condition de lien entre les deux tables a la fin