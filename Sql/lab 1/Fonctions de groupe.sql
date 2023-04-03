/*
? Affiche le plus gros salaire par département
*/

SELECT MAX(sal),DEPTNO
FROM emp
GROUP BY DEPTNO;

/*
? Affiche le plus gros salaire par département
*/

SELECT MAX(sal),job
FROM emp
GROUP BY job;

/*
? Qui a le plus gros salaire
*/

SELECT sal, ename, job
FROM emp
/*
! lors d'une utilisation de fonction, remplacer ORDER BY par GROUP BY fait le tri...
*/
ORDER BY ENAME;

/*
? Un employé de groupe
*/

SELECT sal, ename, job
FROM emp
/*
! RETORUNE UNIQUMENET UN
*/
GROUP BY job;




/*
@ Permettre de faire des calculs
# COUNT
* Retorune le nombre d'élèments
! SELECT COUNT(*) FROM emp;
! SELECT COUNT(*) AS "Nombre Employé",DEPTNO AS "Numéro Département" FROM emp GROUP BY DEPTNO;
! SELECT COUNT(COMM) FROM emp ;
#
*
#
*
#
*
#
*
#
*
#
*
*/