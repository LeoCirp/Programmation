#Affichez le nom de lemployé, le nom du département et la ville pour tous les
#employés qui ne perçoivent pas de commission;

SELECT *
FROM emp, dept
WHERE emp.DEPTNO = dept.DEPTNO
AND (COMM is not NULL);
#EXTRA, A NE PAS FAIRE!
#AND COMM <> 0);