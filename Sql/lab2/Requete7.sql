SELECT ENAME AS "Nom de l'employé"
FROM emp
WHERE COMM IS NULL
OR COMM = 0;
SELECT LOC AS "Lieux", DNAME "Département"
FROM dept ;