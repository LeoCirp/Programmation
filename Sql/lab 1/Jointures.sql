# Requete de jointrue
# Afficher les employés basés a Dallas
;
SELECT *
FROM emp, dept
WHERE loc = "Dallas"
#lien avec les clés (Équijointure)
AND dept.deptno = emp.deptno;

SELECT *
FROM emp, dept
# Les informations en fonction des clés. employés informations et departement
WHERE dept.deptno = emp.deptno;

# Afficher tous les informations de département et tous les informations des employés associcès
SELECT *
FROM emp RIGHT join dept    #emp qui a la priorité  #REQUETE JOINTURE EXTERNE
ON dept.deptno = emp.deptno;


SELECT *
FROM emp left join dept    #emp qui a la priorité  #REQUETE JOINTURE EXTERNE
ON dept.deptno = emp.deptno;

# non equijointure  # produit cartesien (cobiner chaque ligne)

SELECT *
FROM emp, dept;


# jointrue Interne (auto jointure)
# faire des liens dans la meme table
;
SELECT e.ename Employé, s.ename Superviseur
FROM emp e, emp s
WHERE e.MGR = s.empno;

# Afficher les informations des employés et leur manager( superviseur )
;

/* Affiche pas kingm fait juste le lien */
SELECT A1.ename, A2.ename
FROM emp A1, emp A2
WHERE A1.MGR = A2.empno;


# Afficher les informations de TOUS employés et leur manager( superviseur )
;
SELECT A1.ename  AS Employé, A2.ename AS Superviseur
# FORCE LAFFICHAGE A1 AU MAXIMUM ET SUIVRE PAR A2
FROM emp A1 LEFT JOIN emp A2
ON A1.MGR = A2.empno;