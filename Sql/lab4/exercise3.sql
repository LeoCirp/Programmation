/*
    @Non équijointure   :   Possédant un lien, mais pas d'égalité direct
    ?Affichez pour chaque employés les informations suivantes :
    ?Nom - Salaire - Nom du département - Lieu de travail - Grade (catégorie de salaire)
*/
SELECT ENAME As "Nom", SAL "Salaire", DNAME "Département", LOC "Location", GRADE "Niveaux", LOSAL "Min", HISAL "Max"
FROM emp, salgrade, dept
WHERE (sal between salgrade.LOSAL and salgrade.hisal
AND emp.DEPTNO = dept.DEPTNO);