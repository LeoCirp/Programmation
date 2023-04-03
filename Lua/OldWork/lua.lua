net.Receive("SEND TO CLIENT",function()
    ListOfPacket = net.ReadTable()
for _,packet in pairs(ListOfPacket) do
        print(packet)
if IsDarkrp and Exist then
    MsgC(Color(255,200,0),packet,Color(255,255,255)," est bien charger ",Color(0,255,13),"en darkrp\n")
elseif ForceDarkRP and not IsDarkrp and Exist then
    MsgC(Color(255,200,0),packet,Color(255,255,255)," ne peux pas etre charger",Color(255,0,0)," Erreur verification darkrp\n")
elseif SkipDarkRP and Exist then
    MsgC(Color(255,200,0),packet,Color(255,255,255)," est bien charger ",Color(0,255,13),"sans darkrp\n")
elseif Exist then
    MsgC(Color(255,200,0),packet,Color(255,255,255)," ne peux pas etre charger ",Color(255,0,0)," Mauvais Gamemode( "..engine.ActiveGamemode().." )\n")
else 
    MsgC(Color(255,200,0),packet,Color(255,255,255)," ne peux pas etre charger ",Color(255,0,0),"Fichier inexistant\n")
end
end
end)