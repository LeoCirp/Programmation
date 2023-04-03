#Affichez le nom de lemployé, le nom du département et la ville pour tous les
#employés qui ne perçoivent pas de commission;

SELECT *
FROM emp, dept
WHERE COMM is NULL
AND (emp.DEPTNO = dept.DEPTNO);