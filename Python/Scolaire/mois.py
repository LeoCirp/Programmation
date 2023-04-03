'''
Nom du programme : Saisie d'un numéro de mois et du trimestre associé
Auteur : Cirapci, Léo
Date : 28 Octobre 2022
Descriptions : Lit un premier nombre, compare se nombre entre 1 a 12,
si le nombre est égal a 1,2 ou 3, il renvoie le trimestre 1 et le nombre saisie
si le nombre est égal a 4,5 ou 6, il renvoie le trimestre 2 et le nombre saisie
si le nombre est égal a 7,8 ou 9, il renvoie le trimestre 3 et le nombre saisie
si le nombre est égal a 10,11 ou 12, il renvoie le trimestre 4 et le nombre saisie
si le nombre est inférieur a 12, il renvoie un message d'erreur que le nombre est trop petit et la suite de nombre possible (1 a 12)
et le nombre est supérieur a 12, il renvoie un message d'erreur que le nombre est trop haut et la suite de nombre possible (1 a 12)
'''
#Déclaration des variables
NumeroMois = int(input("Entrée le numéro du mois en question"))
Continuation = True
MessageError = "Veuillez sélectionner un nombre entre 1 et 12"
#Function
while Continuation :
    if NumeroMois >= 1 and NumeroMois <= 3 :
        print(NumeroMois,1)
    elif (NumeroMois >= 4) and (NumeroMois <= 6) :
        print(NumeroMois,2)
    elif NumeroMois >=7 and NumeroMois <=9 :
        print(NumeroMois,3)
    elif NumeroMois >=10 and NumeroMois <=12 :
        print(NumeroMois,4)
    elif NumeroMois <=0 :
        print("Erreur : Le nombre est inférieur au minimu (1)",MessageError)
    else :
        print("Erreur : Le nombre est supérieur au maximum (12)",MessageError)

    Continuation = str(input("Désirez-vous continuer O / N ?"))
    if Continuation == "N" and Continuation == "" :
        Continuation = False
    else :
        Continuation = True
    if Continuation :
        NumeroMois = int(input("Entrée le numéro du mois en question")) 
