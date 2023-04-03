@echo off
chcp 863

rem verification de l'Existence d'un fichier

set /p directory= Saisisre le chemin du fichier/Dossier a vérifier

if exist %directory% (echo le fichier/Dossier exist) else echo le fichier existe pas
if not exist %directory% echo > %directory%

pause
rem Supprimer un fichier si il existe pas

set /p directory= Saisisre le fichier a Supprimer

if exist %directory% (rmdir %directory%) else echo le fichier existe pas