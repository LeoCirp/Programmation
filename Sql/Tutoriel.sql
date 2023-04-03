-- * BASE
/*
    # SELECT
    ? permet de retourner les variables rechercher
    @ * = tous les varialbes
    ! SELECT ENAME, JOB, MGR
    ! SELECT *


    # FROM
    ? permet de rechercher la variables dans la rubrique
    ! FROM emp
    ! FROM dept, salgrade


    # WHERE
    ? permet de faire un tri
    ! WHERE ENAME = "SCOTT"
    ! WHERE SAL > 1500


    # AS
    ? permet de renommer une variable avec SELECT
    ! SELECT ENAME AS "Nom"
    ! SELECT ENAME "Nom"


    # CONCAT
    ? permet de regrouper deux text entre eux
    @1 premier text
    @2 second text
    ! SELECT ENAME, JOB, CONCAT(ENAME,JOB)
    ! SELECT SAL, JOB, CONCAT(SAL,JOB)


    # DISTINCT
    ? permet de prendre les trois première valeur
    * Nécessite une clé vert ( Primaire )


    # BETWEEN
    ? permet de controler entre deux valeurs
    ! WHERE SAL BETWEEN 100 AND 1500 #101-1499


    # IN
    ? permet de controler si est inclus et entre deux valeurs
    ! WHERE SAL in 100 AND 1500 #100-1500


    # LIKE
    ? permet de controler par rapport au nombre de caractere rechercher
    @ _ : Nombre de caractere
    @ % : Nombre attendue
    ! WHERE ENAME LIKE "__A%%" # pas_important,pas_important,Obligatoire_A,attendue,attendue


    # ORDER BY
    ? permet de trier en ordre croissant
    ! ORDER BY SAL


    # ORDER BY @ DESC
    ? permet de trier en ordre décroissant
    @ Variable
    ! ORDER BY SAL DESC

    
    # Aritmétique Syntaxe
    ? Différent : <>
    ? Nul : IS NULL
    ? Inverse : NOT
*/;
-- * FONCTION
/*
    #upper || ucase
    ? Permet de mettre les string en majuscule
    @ chaine de caractere
    !ucase("HELLO WORLD")

    #lower || lcase
    ? Permet de mettre les string en minuscule
    @ chaine de caractere
    !lcase("hello world")

    #length 
    ? Permet d'avoir la longeur d'une chaine de caractère
    @ variable
    ! length(ename)

    #SUBSTR || substring
    ? Extrait le texte entre deux point de repère
    @1 variable
    @2 commencement
    @3 fin
    ! SUBSTR(ENAME,2,3)

    #INSTR
    ? Retorune la position du string
    @1 variable
    @2 recherche
    ! INSTR(ENAME,"A")

    #LPAD
    ? Comple pour que le nombre de caractere sois respecter de par la gauche
    @1 variable
    @2 nombre de caractere
    @3 string complémentaire
    ! LAPD(sal,10,@)

    #RPAD
    ? Comple pour que le nombre de caractere sois respecter de par la droite
    @1 variable
    @2 nombre de caractere
    @3 string complémentaire
    ! RAPD(sal,10,@)

    #CONCAT (copie dans base)
    ? Permet de lier deux string
    @1 variable de gauche
    @2 variable de droite
    ! concat(ename,sal)

    #round
    ? Permet d'arondire les nombres
    @1 nombre de base
    @2 le nombre de décimal rechercher (négation arrondie a la dizaine)
    ! ROUND(45.999999999,3),
	! ROUND(45.98745,0),
	! ROUND(44.2,-1);

    #tuncate
    ? Permet d'éliminer les décimal
    @1  nombre de base
    @2  les décimals a retirer (négation arrondie a la dizaine)
    ! TRUNCATE(45.923,2),
	! TRUNCATE(45.923,0),
	! TRUNCATE(45.932,-1);

    #mod
    ? Retorune le restant entre le @1/@2
    @1 nombre A
    @2 nombre B
    ! MOD(1600,300); # 1600 / 300 = 5.333 | 300 * 5 = 1500 | 1600 - 1500 = 
    ! = 100

    #nvl
    ? Permet de convertire une valeur null temporairement
    @1 la valeur
    @2 la nouvelle valeur temporaire
    ! NVL(COMM,10)

    #case
    ? permet de faire des opérations si
    * NÉCESSITE UN FROM APRES (fait partie du select)
    ! CASE job WHEN "MANAGER" then sal * 1.1
    ! ELSE sal
    ! END "Modifier"

    # SELECT NOW();
    # SELECT CURDATE() AS TODAY; 
    ? Retorune aujourdhui aaaa-mm-jj
    # SELECT CURTIME() AS HEURE; 
    ? Retourne maintenant hh:mm:ss
    # SELECT DATEDIFF("2023-02-08", "2019-02-08 12:59:59");
    # SELECT DATEDIFF("12:00:05", "15:14:59"); #A CORRIGER !
    # SELECT DATE_FORMAT(CURDATE() CURTIME(),"jour %d du mois %m en l'an %y") Salut; 
    ? permet le format dune date
    # SELECT DATE_FORMAT(CURTIME(),"Il est %H:%i et %s") Salut; 
    ? permet le format dune heure aussi
    # %D 
    ? numéro du jour en anglais
    # %d 
    ? numéro du jour avec deux chiffre
    # %M 
    ? nom du mois en anglais
    # %m 
    ? numéro du mois
    # %Y 
    ? anné a 4 chiffres
    # %y 
    ? anné a 2 chiffres
    # %H 
    ? format 24h
    # %h 
    ? format 12h 
    # %i 
    ? minute
    # %s 
    ? seconde
*/;

--* Jointures
/*
    #ON
    ? permet de faire une condition dans une jointure
    #LEFT JOIN || RIGHT JOIN
    ? Permet d'afficher toutes les lignes et l'autre collone suit
    * TYPES
    #Équijointure (equijoin) : 
    ? Une équijointure est une jointure basée sur l'égalité entre deux colonnes de deux tables différentes. 
    ? Elle est utilisée pour combiner les lignes de deux tables ayant des valeurs communes dans les colonnes comparées.
    ! Méthode 1
    SELECT emp.empno, emp.ename, emp.deptno, dept.deptno, dept.loc
    FROM emp, dept
    WHERE emp.deptno = dept.deptno;
    ! Méthode 2
    SELECT emp.empno, emp.ename, emp.deptno, dept.deptno, dept.loc
    FROM EMP
    JOIN DEPT ON DEPT.DEPTNO = EMP.DEPTNO;
    ! Méthode 3
    SELECT emp.empno, emp.ename, emp.deptno, dept.deptno, dept.loc
    FROM EMP
    JOIN DEPT USING(DEPTNO);
    ! Méthode 4
    SELECT e.ename, e.sal, d.dname, d.loc, s.grade
    FROM emp e
    JOIN dept d ON e.deptno = d.deptno
    JOIN salgrade s ON e.sal BETWEEN s.losal AND s.hisal;
    @ L’Equijointure est basée sur la relation entre les colonnes DEPTNO des deux tables. 
    #Non équi-jointure (non-equijoin) : 
    ? Une non équi-jointure est une jointure qui n'est pas basée sur l'égalité entre deux colonnes de deux tables différentes.
    ? Elle est utilisée pour combiner les lignes de deux tables en fonction de conditions autres que l'égalité entre colonnes.
    ! Méthode 1
    SELECT e.ename, d.dname, s.grade
    FROM emp e, dept d, salgrade s
    WHERE e.deptno= d.deptno
    AND e.sal BETWEEN s.losal AND s.hisal;
    #Jointure externe (outer join) : 
    ? une jointure externe est une jointure qui inclut toutes les lignes de la table de gauche, même si elles n'ont pas de correspondance dans la table de droite. 
    ? Il existe deux types de jointures externes : LEFT JOIN et RIGHT JOIN
    ! Méthode 1
    SELECT emp.ename, dept.dname, dept.deptno
    FROM emp
    JOIN dept
    ON dept.deptno = emp.deptno;
    ! Méthode 2
    SELECT e.ename, d.dname, d.deptno
    FROM emp right join dept d
    ON e.deptno = d.deptno;
    #Auto jointure (self join) : 
    ? une auto jointure est une jointure dans laquelle une table est jointe à elle-même en utilisant des alias différents. 
    ? Elle est utilisée pour associer les lignes d'une même table ayant des valeurs communes dans les colonnes comparées.
    ! Méthode 1
    SELECT e.ename employé, s.ename superviseur
    FROM emp e, emp s
    WHERE e.mgr = s.empno;
    ! Méthode 2
    SELECT e.ename, s.ename
    FROM emp e left outer
    join emp s on s.empno = e.mgr;


    #Équijointure (equijoin) : 
    SELECT emp.empno, emp.ename, emp.deptno, dept.deptno, dept.loc
    FROM EMP
    JOIN DEPT USING(DEPTNO);
    #Non équi-jointure (non-equijoin) :
    SELECT e.ename, d.dname, s.grade
    FROM emp e, dept d, salgrade s
    WHERE e.deptno= d.deptno
    AND e.sal BETWEEN s.losal AND s.hisal;
    #Jointure externe (outer join) : 
    SELECT emp.ename, dept.dname, dept.deptno
    FROM emp
    JOIN dept
    ON dept.deptno = emp.deptno;
    #Auto jointure (self join) : 
    SELECT e.ename, s.ename
    FROM emp e left OUTER
    join emp s on s.empno = e.mgr;
*/;
    --* fonction
/*

    #AVG
    ? Retoune la moyenne
    #SUM
    ? Retourne la somme
    #MIN
    ? Retourne la plus petite valeur
    #MAX
    ? Retorune la plus grande valeur
    #COUNT
    ? Retourne le nombre de ligne
    * NULL est ignorer
    #STDDEV
    ? Retourne l'écart type
    #VARIANCE
    ? Retourne la variance
    #SQRT
    ? Retourne la racine carré
    #GROUP BY
    ? Permet de trier par colonne (les valeurs dedans)
    * pas de where a utiliser remplacer par having
    * Aucun alias
    #HAVING
    ? Meme opération que WHERE
*/