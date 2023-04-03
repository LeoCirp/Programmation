GMPLEX = {["Version"] = 1,["Name"] = "GMPLEX PACK"}
ListOfPacket = {}
ListOfErreur = {}
function ErrorToDetect(packet)
    if SERVER then
        if Erreur[1]  then
            MsgC(Color(255,255,255),"\nConfiguration ",Color(255,200,0),packet,Color(255,0,0)," désactiver")
            MsgC(Color(255,255,255),"\nLibrairie ",Color(255,200,0),packet,Color(255,0,0)," désactiver")
            MsgC(Color(255,255,255),"\npanel ",Color(255,200,0),packet,Color(255,0,0)," désactiver\n")
        else
            include("librairies/"..packet..".lua")
            include("panel/"..packet..".lua")
            include("configuration/"..packet..".lua")
            MsgC(Color(255,255,255),"\nConfiguration du module ",Color(255,200,0),packet,Color(0,255,4)," activer")
            MsgC(Color(255,255,255),"\nLibrairie du module ",Color(255,200,0),packet,Color(0,255,4)," activer")
            MsgC(Color(255,255,255),"\npanel du module ",Color(255,200,0),packet,Color(0,255,4)," activer\n")
        end
    end
end

function FileToDetect(packet)
    if SERVER then
        if file.Exists("librairies/"..packet..".lua","LUA") and file.Exists("panel/"..packet..".lua","LUA") and file.Exists("configuration/"..packet..".lua","LUA") then
            Erreur = false
            Exist = true
        else
            Erreur = true
            Exist = false
        end
    end
end
function VerificationDepandance(packet)
    table.insert(ListOfPacket,packet)
    if SERVER then
        if IsDarkrp and Exist then
            Message = {" est bien charger ","en darkrp\n"}
            Erreur = {false}
        elseif ForceDarkRP and not IsDarkrp and Exist then
            Message = {" ne peux pas etre charger"," Erreur verification darkrp\n"}
            Erreur = {true,1}
        elseif SkipDarkRP and Exist then
            Message = {" est bien charger ","sans darkrp\n"}
            Erreur = {false}
        elseif Exist then
            Message = {" ne peux pas etre charger"," Mauvais Gamemode( "..engine.ActiveGamemode().." )\n"}
            Erreur = {true,2}
        else 
            Message = {" ne peux pas etre charger","Fichier inexistant\n"}
            Erreur = {true,3}
        end
        print(Message,Erreur,"M-E")
    end
    table.insert(ListOfErreur,Erreur)
end
function ShowPacketList()
    if CLIENT then
        for l,packet in pairs(ListOfPacket) do
            print(l,packet)
            print(Erreur)
        end
    end
end
function Depandance(packet,ForceDarkRP,SkipDarkRP)
    IsDarkrp = engine.ActiveGamemode() == "darkrp"
    FileToDetect(packet)
    VerificationDepandance(packet)
    ErrorToDetect(packet)
end

table.insert(Deposite["packet"],packet)
table.insert(Deposite["ErreurCode"],01)
table.insert(Deposite["Message"]["preload"],MessagePreload["InCorrect"])
table.insert(Deposite["Message"]["load"],"Mauvais Gamemode( "..engine.ActiveGamemode().." )\n")
    



GMPLEX = {["Version"] = 1,["Name"] = "GMPLEX PACK"}
Deposite = {
    ["packet"] = {},
    ["ErreurCode"] = {},
    ["Message"] = {["preload"] = {},["load"] = {},}
}
local CompteurPacket = 0
function VerificationDepandance (packet)
    GameModeIsDarkRP = engine.ActiveGamemode() == "darkrp"
    GameModeIsCustom = engine.ActiveGamemode() == "Private"
    GetGameMode = engine.ActiveGamemode()
    ForceGameModeDarkRP  = true 
    SkipGameModeDarkRP = true
    FileOfPacketExist = true 
    if GameModeIsDarkRP and FileOfPacketExist then
        ErreurIndex = {"Engine",false,00} // darkrp detect
    elseif GameModeIsCustom and FileOfPacketExist then
        ErreurIndex = {"Engine",false,01} // custom detect
    elseif ForceGameModeDarkRP and not GameModeIsDarkRP and FileOfPacketExist then
        ErreurIndex = {"Engine",true,10} // verification darkrp
    elseif SkipGameModeDarkRP and FileOfPacketExist then
        ErreurIndex = {"Engine",false,02} // skip gamemode
    elseif FileOfPacketExist then
        ErreurIndex = {"Engine",true,11} // Need darkrp
    else 
        ErreurIndex = {"Engine",true,12} // No file directory found
    end
    CompteurPacket = CompteurPacket + 1
    ErreurType = ErreurIndex[1]
    ErreurFound = ErreurIndex[2]
    ErreurCode = ErreurIndex[3]
    table.insert(Deposite["ErreurCode"][CompteurPacket]["Types"],ErreurType)
    table.insert(Deposite["ErreurCode"][CompteurPacket]["Found"],ErreurFound)
    table.insert(Deposite["ErreurCode"][CompteurPacket]["Code"],ErreurCode)
end

function ErrorToDetect(packet)
    if Deposite["ErreurCode"][CompteurPacket]["Found"] then
        for _,v in pairs (Deposite["ErreurCode"][CompteurPacket]["Code"]) do
            print(_,v)
        end
    end
end