def VerificationTemperature(fTemperature) :
    if fTemperature >= 32 and fTemperature <=212 :
        print(fTemperature)
    else :
        print("La température saisie n'est pas valide",fTemperature)
VerificationTemperature(30)
VerificationTemperature(32)
VerificationTemperature(212)
VerificationTemperature(220)