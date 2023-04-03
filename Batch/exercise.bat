@echo off
chcp 863
echo Bonjour
echo %1
echo %2
echo [[[[[[[[[[==========]]]]]]]]]]
set var= Mon premier script batch

SET /a X=5 
SET /a Y=6
SET /a Z=%X%+%Y%

SET /p A= Saisire une valeur
SET /p B= Saisire une second valeur
SET /a C=%A%*%B%

SET /p NomDossier= Saisire le nom du NomDossier

echo [[[[[[[[[[==========]]]]]]]]]]
echo %var%
echo [[[[[[[[[[==========]]]]]]]]]]
echo la valeur de X est : %X%
echo la valeur de Y est : %Y%
echo la valeur de Z est : %Z%, (%X% + %Y%)
echo [[[[[[[[[[==========]]]]]]]]]]
echo %A%, est la valeur saisie
echo %B%, est la second valeur saisie
echo %C%, est le produits des deux valeurs saisie
echo [[[[[[[[[[==========]]]]]]]]]]
mkdir "%NomDossier%"
echo %NomDossier%

echo %USERNAME%
echo %PATH%
echo %TEMP%