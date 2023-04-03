if SERVER then
    if ForceDarkRP then
        if engine.ActiveGamemode() == "darkrp" then
            MsgC(Color(255,200,0),packet,Color(255,255,255)," est bien charger en darkrp\n")
            Erreur = false
        else
            MsgC(Color(255,200,0),packet,Color(255,255,255)," ne peux pas etre charger",Color(255,0,0)," Erreur verification darkrp\n")
            Erreur = true
        end
    elseif (SkipDarkRP) then
        MsgC(Color(255,200,0),packet,Color(255,255,255)," est bien charger sans le  darkrp\n")
        Erreur = false
    else
        MsgC(Color(255,200,0),packet,Color(255,255,255)," ne peux pas etre charger",Color(255,0,0)," Mauvais Gamemode\n")
        Erreur = true
    end
    end
    ErrorToDetect(packet)