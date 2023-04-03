'''
Nom du programme :
Auteur :
Date :
Description :
'''
#####Spécificité#####
#   Commentaire sur une ligne
'''Commentaire sur plusieur ligne'''
#Anoter que python fonction via l'indentasion (la tabulation), a bien respecter et censible a la case (Majuscule)#
#####Déclaration des types de variables possible#####
'''
str = string
int = number
flaot = decimal
bool = boolean (True/False)
'''
#####Déclaration des variables possible depuis la console#####
''' variable = type(input("Le message a affichier"))'''
variable = str(input("Exemple de variable a assigner depuis la console, string\n"))
variable2 = int(input("Exemple de variable a assigner depuis la console, nombre\n"))
variable3 = bool(input("Exemple de variable a assigner depuis la console, boolean\n"))
#####Fonction tantque #####
'''
tantque (condition) faire
while   (condition) :
'''
while variable != "Bonjour" :
    print("La variable n'Est pas égale a bonjour")
    variable = str(input("Exemple de variable a assigner depuis la console, string\n"))
print("La variable est égale a Bonjour")
#####Fonction si #####
'''
si (condition) faire sinonsi (condition) faire sinon faire
if (condition) :     elif    (condition) :     else :
'''
if variable3 :
    print("Variable 3 est Vrai",variable3)
elif variable2 != 0 :
    print("Le nombre est suppérieur a 0",variable2)
else :
    print("Variable 3 est Faux et le nombre est égal ou inféreiru a 0",variable3,variable2)