@echo off
chcp 863

SET /p var=Entrée un premier nombre
SET /p var2=Entrée un second nombre

if %var2% equ 0 (SET Message=Erreur) else (SET Message=Correct)
echo %Message%