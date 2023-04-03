@echo off
set /p NombreA= Sélection du premier Nombre : 
set /p NombreB= Sélection du second Nombre : 
echo Le premier Nombre est : %NombreA%
echo le second Nombre est: %NombreB%
pause

if %NombreA% gtr %NombreB% (echo %NombreA% est le supérieur (%NombreB%)) else (echo %NombreB% est le supérieur (%NombreA%))
