@echo off
:start
set /p num1=Entrez le premier nombre
set /p num2=Entrez le deuxième nombre

if "%num2%"=="0" (
  echo Le deuxième nombre ne peut pas être 0. Veuillez réessayer.
  goto start
)

set /a result=%num1% / %num2%
echo Le résultat de la division de vos deux nombres est : %result%