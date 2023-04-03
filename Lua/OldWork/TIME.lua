imposition = {
    ["demo"] = {0,15},
    ["dic"] = {15,100}
    }
    montant = 1000
    timer = {io.read(),"S"}
    
    function delaysTo()
        if timer[2] == "H" then
            timer = timer[1] * 3600
            print(timer/3600 .."Hours")
        elseif timer[2] == "M" then
            timer = timer[1] * 60
            print(timer/60 .."Minutes")
        elseif timer[2] == "S" then
            timer = timer[1]
            print(timer.." seconds")
        end
    end
    OLDREF = {}
    function compteur(stats,name,stop)
        local stats = stats
        local name = name or nil
        local temp_base = os.time
        temp_base()
        local temp_init = temp_base()
        local temp_calc = temp_init + 1
        print("Timer start : 0","\tR�f�rence : "..temp_init,"\tNom :"..name)
        while (stats~=false) do
          if type(name)==string then
            print("please select a name for the timer:)")
          break
          end
          local result = (temp_calc-temp_init)
            if result == timer then
            print(temp_init,"REF",timer..name,"RST\n","Ancien r�f�rent list")
            table.insert(OLDREF,1,temp_init)
            for k,v in pairs(OLDREF) do print(v) end
            print("\n\n\tRELOAD?","press yes or y")
            reloading = io.read()
            if reloading == "yes" or "y" then
                compteur(_,"s")
                else
                break
            end
    
            end
    
    
    
    
    
            if timer % 2 then timers = timer-1 else timers = timer end
            if result == timers then
            print("Middle","Timer stats : "..result,name,"\tR�f�rence : "..temp_init)
            end
            temp_calc = temp_calc + 1
            old = result
            local temp_delay = os.clock() + 5/10
            repeat until os.clock() >  temp_delay
        end
    end
    
    function cashing()
        delaysTo()
        compteur(_,"s")
    end
    cashing()
    