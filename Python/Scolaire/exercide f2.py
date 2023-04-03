############ Importations et fonctions ############
def Lire_Valeur() :
    F_Valeur = int(input("Valeur\t"))
    return F_Valeur
def Calculer_Somme(F_ValeurA,F_ValeurB) :
    F_Somme = 0 #int
    F_Somme =  F_ValeurA + F_ValeurB
    return F_Somme
############ Déclaration des variables ############
Nombre_Additions = 5
############ Code ############
while Nombre_Additions != 0 :
    ValeurA = Lire_Valeur()
    ValeurB = Lire_Valeur()
    Somme = Calculer_Somme(ValeurA,ValeurB)
    print(ValeurA,"+",ValeurB,"=",Somme)
    Nombre_Additions = Nombre_Additions - 1