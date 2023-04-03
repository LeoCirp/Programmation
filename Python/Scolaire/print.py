#Déclaration des variables
Stress = int(input("Saisire le niveau de stress maximal:"))         #int
Montant = float(input("Saisire le montant a chaque fin de cycle"))  #float
Delay = int(input("Entrée la durée d'un cycle"))                    #int
NextStress = int(input("Entrée le nombre de cycle par stress"))     #int
Imposition = int(input("Entrée le pourcentage d'imposition"))       #int
Processus = bool(input("Démarrage du Processus"))                   #bool
Retrait = False                                                     #bool
CheckStress = 0                                                     #int
CheckDelay = 0                                                      #int
CheckMontant = 0
CheckCycle = 0
Client = CheckMontant * Imposition / 100                            #float
Serveur = CheckMontant - Client                                     #float
#Fonction
while Processus and Stress != CheckStress :
    CheckDelay = CheckDelay + 1
    if CheckDelay == Delay - 1:
        CheckMontant = CheckMontant + CheckMontant
        CheckCycle = CheckCycle + 1
    if CheckCycle == 3 :
        CheckStress = CheckStress + 1
print("END")
