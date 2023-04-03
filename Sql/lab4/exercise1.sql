#1 - Affichez le numéro de l’employé SCOTT, son numéro de département et son
#lieu de travail.;
#Équijonture
SELECT emp.empno "Numéro de l'employé", emp.deptno "Numéro département", dept.loc "lieux"
#SELECT empno , emp.deptno , loc
FROM emp, dept
WHERE ENAME = "SCOTT"
AND dept.deptno = emp.deptno;

#supperpose les informations (ecrase les doublons) en se bassant sur un meme element (key)