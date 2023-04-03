/* SELECT */
#Permet de sélectioner les variables dans les colonnes
/* AS */
#Permet de renommer un variabes sélectioner (peut aussi juste mettre un espace)
/* CONCAT(A,B)*/
#Petmet de faire un lien entre deux variables
/* DISTINCT*/
#Petmet de retoruner les trois premières variables (Nécessite la clé vert)
/* From */
#Permet didentifier la rubrique a traiter
/* Where */
#Permet de faire un restriction
    /* Aritméyique */
    # <> = <= >= + - * / ^
    /* BETWEEN */
    # Permet de controler entre deux points
    /* IN */
    # Permet de controler entre deux points et linclus  
    /* LIKE "_%" */
    # Permet de controler par filtre ( _ le nombre attendue) ( & le maximum)
    /* AND */
    # Permet de faire un second WHERE tous en linclusant
    /* OR */
    # Permet de faire un second WHERE ou cas ou que le premier where nest pas accepter
    /* Not */
    # Permet de controler lopposé
/* ORDER BY */
# Permet dafficher en ordre croissant
    /* ORDER BY ... DESC */
    # Permet dafficher en ordre décroissant
/*UPPER*/ #permet de convertire les chaines de caractère en MAJ	//alternatif UCASE
/*LOWER*/ #permet de convertire les chaines de caractère en min	//alternatif LCASE
/*LENGTH*/ #permet d'avoir la longeur d'une chaine de caractère
/*SUBSTRING*/ # Retorune les saisie ( deuxieme par = le commencement, troiseme = la fin	// alternatif SUBSTR
/*INSTR*/ #permet de voir si ya la variable a un caractere et RETOUNRE la position	
/*LPAD*/ #permet de mettre le caractere a gauche pour quil est au total le nombre de caractere (la var, le nombre, lajout)
/*RPAD*/ #permet de mettre le caractere a droire pour quil est au total le nombre de caractere (la var, le nombre, lajout)
/*CONCAT*/ #permet de lier deux choses entre eux
/*ROUND*/ #permet darandire les nombres (négation arrondie a la dizaine)
/*TRUNCATE*/ #permet de conserver des nombres après la virgule (négation arrondie a la dizaine)
/*MOD*/ #Modulo permet de retrouner le reste de la valeur du par1 / par2
/*NOW*/ #Retroune le momement présent au format aaaa-mm-jj hh:mm:ss
/*CURDATE() AS TODAY*/ # Retorune aujourdhui aaaa-mm-jj
/*CURTIME() AS HEURE*/ # Retourne maintenant hh:mm:ss
/*DATEDIFF("2023-02-08", "2019-02-08")*/ # Retorune la différence de date restante
/*DATEDIFF("12:00:05", "15:14:59")*/ # Retorune la différence de temps restante
/*NVL*/ #permet de convertire une valeur null par une autre temporairement le temps de laffichage
/*CASE*/ #permet des faire des expression if then else (fait partie du select)
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