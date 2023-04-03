SELECT *
FROM emp;
#Fonction Utilisation
/*UPPER*/ #permet de convertire les chaines de caractère en MAJ	//alternatif UCASE
/*LOWER*/ #permet de convertire les chaines de caractère en min	//alternatif LCASE
#Exemple
SELECT LOWER(ENAME), UPPER(Job)
FROM emp;
/*LENGTH*/ #permet d'avoir la longeur d'une chaine de caractère
#Exemple LENGHT("BONJOUR") = 7
SELECT ENAME, LENGTH(ENAME)
FROM emp;
/*SUBSTRING*/ # Retorune les saisie ( deuxieme par = le commencement, troiseme = la fin	// alternatif SUBSTR
#Exemple
SELECT ename, SUBSTRING(ename,1,3) 
FROM emp;
/*INSTR*/ #permet de voir si ya la variable a un caractere et RETOUNRE la position	
#Exemple
SELECT ENAME, INSTR(ENAME,"A")
FROM emp;
/*NPAD*/ #permet de mettre le caractere a gauche pour quil est au total le nombre de caractere
#Exemple
SELECT ename, sal, LPAD(sal,10,"@")
FROM emp;
/*NPAD*/ #permet de mettre le caractere a droire pour quil est au total le nombre de caractere
#Exemple
SELECT ename, sal, RPAD(sal,10,"@")
FROM emp;
/*CONCAT*/ #permet de lier deux choses entre eux
#Exemple
SELECT ename,sal,CONCAT(ename,sal)
FROM emp;
/*round*/ #permet darandire les nombres (négation arrondie a la dizaine)
#Exemple
SELECT ROUND(45.999999999,3),
		 ROUND(45.98745,0),
		 ROUND(44.2,-1);
/*truncate*/ #permet de conserver des nombres après la virgule (négation arrondie a la dizaine)
#Exemple
SELECT TRUNCATE(45.923,2),
		 TRUNCATE(45.923,0),
		 TRUNCATE(45.932,-1);
/*mod*/ #Modulo permet de retrouner le reste de la valeur du par1 / par2
#Exemple
SELECT MOD(1600,300); # 1600 / 300 = 5.333 | 300 * 5 = 1500 | 1600 - 1500 = 100
/*NOW*/ #Retroune le momement présent au format aaaa-mm-jj hh:mm:ss
#Exemple
SELECT NOW();
SELECT CURDATE() AS TODAY; # Retorune aujourdhui aaaa-mm-jj
SELECT CURTIME() AS HEURE; # Retourne maintenant hh:mm:ss
SELECT DATEDIFF("2023-02-08", "2019-02-08 12:59:59");
SELECT DATEDIFF("12:00:05", "15:14:59"); #A CORRIGER !
SELECT DATE_FORMAT(CURDATE() CURTIME(),"jour %d du mois %m en l'an %y") Salut; # permet le format dune date
SELECT DATE_FORMAT(CURTIME(),"Il est %H:%i et %s") Salut; # permet le format dune heure aussi
/*
%D = numéro du jour en anglais
%d = numéro du jour avec deux chiffre
%M = nom du mois en anglais
%m = numéro du mois
%Y = anné a 4 chiffres
%y = anné a 2 chiffres
%H = format 24h
%h = format 12h 
%i = minute
%s = seconde
*/

/*NVL*/ #permet de convertire une valeur null par une autre (temp)
#Exemple
SELECT *,COMM, (sal*10 + NVL(COMM,10) ) "BONUS" #Attribue temporairement la valeur de COMM a 10, puis la reasinge a NULL
FROM emp
WHERE ENAME = "SMITH"
AND DEPTNO = "20";
/*CASE*/ #permet des faire des expression if then else (fait partie du select)
#Exemple
SELECT job,sal,
CASE job
	WHEN 'MANAGER' THEN sal * 1.1			#if = when	#then = then	#else	=	else	#elseif = ?
	WHEN "ANALYST" THEN sal * 5			
	ELSE sal
END "Modifier"
FROM emp;