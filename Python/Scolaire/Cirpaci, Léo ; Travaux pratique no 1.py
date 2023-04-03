'''
Nom du programme : Gestionaire de reçu de ticket
Auteur : Cirpaci, Léo
Date : 30 Octobre
Descriptions : Lie une seule fois le nom du spectacle et assigne un premier numéro de commande (C-1)
Tant que le numéro de commande "C-0" ou "C-0000" n'est pas saisi,
il va lire en boucle le nombre de billets régulier et étudiant, le multiplier par leurs prix
et si la lecture de livraison est par adresse courriel, il va afficher le courriel et rajouter
10$ au montant total. En ajoutant 15% du montant pour les taxes. Il terminera en affichant
le nom du spectacle, le montant total et le numéro de commande
'''
#Déclaration des variables
NomSpectacle = str(input("Entrée le nom du spectacle\n"))                                           #str
NumeroCommande = str(input("Entrée le numéro de la première commande\n"))                           #str
MontantBilletsRegulier = 0                                                                          #int
MontantBilletsEtudiant = 0                                                                          #int
#Fonction
while NumeroCommande != "C-0" and NumeroCommande != "C-0000" :
    NombreBilletsRegulier = int(input("Entrée le nombre de billets régulier (29.95$/unité)\n"))     #int
    NombreBilletsEtudiant = int(input("Entrée le nombre de billets étudiant (15.65$/unité)\n"))     #int
    ModeLivraison = str(input("Entrée le Mode de livraison (Courriel / Poste / Salle)\n"))          #str
    MontantBilletsRegulier = NombreBilletsRegulier * 29.95                                          #float
    MontantBilletsEtudiant = NombreBilletsEtudiant * 15.65                                          #float
    if ModeLivraison == "Courriel" :
        CourrielEnvoie = str(input("Entrée le Courriel d'envoi\n"))                                 #str
        MontantTotal = (MontantBilletsRegulier + MontantBilletsEtudiant + 10)*115/100               #float
        print("\n\nNom du spectacle :",NomSpectacle)
        print("\nCourriel D'envoie :",CourrielEnvoie)
        print("\nMontantTotal :","${:.2f}".format(MontantTotal),"$")
        print("\nNuméro de commande :",NumeroCommande)
    else :
        MontantTotal = (MontantBilletsRegulier + MontantBilletsEtudiant)*115/100                    #float
        print("\n\nNom du spectacle :",NomSpectacle)
        print("\nMontantTotal :","${:.2f}".format(MontantTotal),"$")
        print("\nNuméro de commande :",NumeroCommande)
    NumeroCommande = str(input("\n\nVeuillez entrée le numéro de la prochaine commande\n"))         #str
