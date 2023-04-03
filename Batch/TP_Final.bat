@echo off
set name=Cirpaci_Léo
set studentCode=2165937

for /L %%a in (2021,1,2023) do (
  md "%name%_%%a"
  for /L %%b in (1,1,3) do (
    md "%name%_%%a\%studentCode%_%%b"
    echo LC > "%name%_%%a\%studentCode%_%%b\transactions.txt"
  )
)