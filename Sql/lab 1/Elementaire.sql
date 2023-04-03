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

SELECT * # les sections avec les informations * = TOUS, SECTION_NAME, SECTION_NAME_WITH_MODIFICATION( OPERATION )
FROM emp; # La class de lobjet (la rebuique)
WHERE class = 'recherche, doit avoir cela'
SELECT SAL AS SALAIRE OU SELECT SAL SALAIRE #Rename la colonne *si mots composer, mettre entre ""
SELECT CONCAT(element1,element2) # permet de joindre les mots avec les contenus
SELECT DISTINCT #RETROUNE LES TROIS PREMIER (NÉCESSITE LA CLIER VERT)
<> # Diferrent de
WHERE SAL BETWEEN 1000 AND 1500 # retourne entre les donnés dans SAL
WHERE SAL IN (7902,7566) # retourne si est dans la valeur
WHERE ename LIKE __A% #permet de faire une recherche spécifique
# exemple CARACTERE_PAS_IMPORTANT = _                % = NOMBRE QUI EST ATTEBDUE APRÈS
# Genre BLAKE  CLARK
 # ** METTRE EN GUILLEMENT LES CARACTERES
WHERE mgr IS NULL # RETOURNE LES NULL
AND Condition2 # comme WHERE, PERMET UNE SECOND CONDITION qui doit etre aussi respecter
OR condition # un autre choix de condition
NOT # RETOURNE LES OPPOSÉ
ORDER BY SAL # PERMET AFFICHER DU PLUS PETIT
ORDER BY SAL DESC #PERMET DU PLUS GRAND 
#*Nom composé ne marche pas
# Numero retourne le numero des colones (pas sur)