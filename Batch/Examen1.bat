@echo off
set /a result=1
set /a count=0

:boucle
set /p n="Veuillez saisir un nouveau nombre (ou 'quitter' pour arrêter) : "
if "%n%"=="quitter" goto fin
set /a result=%result%*%n%
set /a count=%count%+1
goto boucle

:fin
echo Le résultat de la multiplication est : %result%
echo Le nombre de saisies au clavier est : %count%