def calculerSomme (FValeurA,FValeurB) :
    FSomme = 0  #int
    FSomme = FValeurA + FValeurB  #int
    return FSomme
NombreAddition = 5 #int
while NombreAddition != 0 :
    valeur1 = int(input("Sélectioner le premier nombre\t"))
    valeur2 = int(input("Sélectioner le second nombre\t"))
    somme = calculerSomme(valeur1,valeur2)
    print(valeur1,"+", valeur2, "=", somme)
    NombreAddition = NombreAddition - 1
    print()