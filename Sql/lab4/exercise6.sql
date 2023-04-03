/*
    ?afficher les noms de tous les départements et les noms de tous leur employés
    @jointure externe
*/
SELECT DNAME,ENAME
/*
    !Element visé, element ajouter
    #ici dept est visé, donc LEFT
    *FROM dept, emp
*/
FROM dept LEFT JOIN emp
on emp.DEPTNO = dept.DEPTNO;