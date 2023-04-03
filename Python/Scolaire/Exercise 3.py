def Options() :
    NombreOptionsA = 0
    NombreOptionsC = 0
    NombreOptionsSelectioner = 0
    Options = str(input("Sélection de l'options\n"))
    while not Options == "Mettre fin au programme" and not Options == "M" :
        if Options == "Afficher" or Options == "A" :
            NombreOptionsA = NombreOptionsA + 1
            NombreOptionsSelectioner = NombreOptionsSelectioner + 1
        elif Options == "Créer" or Options == "C" :
            NombreOptionsC = NombreOptionsC + 1
            NombreOptionsSelectioner = NombreOptionsSelectioner + 1
        elif Options == "Supprimer" or Options == "S" :
            NombreOptionsSelectioner = NombreOptionsSelectioner + 1
        elif Options == "Renommer" or Options == "R" :
            NombreOptionsSelectioner = NombreOptionsSelectioner + 1
        elif Options == "Mettre fin au programme" or Options == "M" :
            NombreOptionsSelectioner = NombreOptionsSelectioner + 1
        else :
            print("Options non inclus\n")
        Options = str(input("Sélection de l'options\n"))
    print(NombreOptionsA,"Options (A)fficher sélectioner")
    print(NombreOptionsC,"Options (C)réer sélectioner")
    print(NombreOptionsSelectioner,"Options valide sélectioner")
Options()