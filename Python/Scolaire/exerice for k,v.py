TabCodes = {418,514,643,519,234,480}
ArretVerification = False
def Verification_Code(check:int) :
    for number in TabCodes :
        if number == check :
            return True
while not ArretVerification :
    x = int(input("Saisire le code a vérifier\n"))
    y = Verification_Code(x)
    if y :
        print(x,"est répertorier\n")
    else:
        print(x,"n'est pas répertorier\n")
    ArretVerification = bool(input("Fin de la vérification?\nEntrée une saisie pour stoper le programme\n"))