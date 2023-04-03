'''
Nom du programme : Travail Pratique No.2
Auteur : Cirapci, Léo
Date : 15 Décembre 2022
Description : Invite a l'utilisateur de saisire une options
A partire d'une table prédéfinit, contenant 10 notes,
vas sois identifier le nombre de notre correspondant a la note saisie dans l'options Identique
ou bien, calculer la moyenne des 10 notes dans l'options Moyenne
ou bien, arreter le programme
'''
##### Déclaration tableau #####
Notes = []
for i in range(10):
    Notes.insert(i, int(input("Saisire une note\n")))
##### Déclaration des variables #####
Options = str(input("Veuillez sélectionner une options parmi les suivantes\n[I]dentique : Affiche le nombre de valeur identique\n[M]oyenne : Affiche la moyenne\n[Q]uitter : Quitte le programme\nVotre choix : "))
##### fonction #####
def Moyenne() :
    result = 0
    for j in range(10):
        result = result + Notes[j]
        result = result / 10
    return result
def Identique(valeur) :
    Nombre_Identique = 0
    for j in range(10) :
        result = []
        if Notes[j] == valeur :
            result.insert(j,valeur)
            for _ in result :
                Nombre_Identique = Nombre_Identique + 1
    result = 0
    return Nombre_Identique
##### Code #####
while not Options == "Q" and not Options == "Quitter" :
    if Options == "M" or Options == "Moyenne" :
        print(Moyenne)
    if Options == "I" or Options == "Identique" :
        value = int(input("Veuillez sélectionner une note a comparer dans le tableau"))
        print(Identique(value))
    Options = str(input("Veuillez sélectionner une options parmi les suivantes\n[I]dentique : Affiche le nombre de valeur identique\n[M]oyenne : Affiche la moyenne\n[Q]uitter : Quitte le programme\nVotre choix : "))