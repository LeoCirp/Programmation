@echo off
chcp 863
set /p NomDossier=Saisire le nom du fichier
mkdir "%NomDossier%"
echo le dossier %NomDossier% est crée avec succes
rename "%NomDossier%" "test"
pause
rmdir "test"
echo le dossier %NomDossier% est supprimer avec succes
