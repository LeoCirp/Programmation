@echo off
cd /test
FOR /L %%d IN (1,1,100) DO (
    REM echo > Fichier%%d.txt
    REM del Fichier%%d.txt
)
pause