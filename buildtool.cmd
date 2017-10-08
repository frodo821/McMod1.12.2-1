@echo off
py -c "print('@echo off')"> temp.cmd
echo cd "%~dp0">> temp.cmd
echo prompt modding forge1.12.2^^^>>> temp.cmd
echo title forge 1.12.2 %~dp0>> temp.cmd
start cmd /s /k temp.cmd
ping localhost -n 2 > nul
del temp.cmd