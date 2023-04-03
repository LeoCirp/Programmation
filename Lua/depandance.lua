Rep = {}
function Init(packet)
    Rep[packet] = {}
    function CallingRep()
        for k,v in pairs(Rep) do
            print(k,v)
        end
    end
    function DirectoryCheck()
        local dirToVerify ={
            ["librairies/"] = {false},
            ["panel/"] = {false},
            ["Configuration/"] = {false}
        }
        for DirToVerification,confirm in pairs(dirToVerify) do
            if SERVER then
                if not file.Exists(DirToVerification..packet..".lua") then
                    confirm = true
                    Rep[packet]["File"] = {}
                    table.insert(Rep[packet]["File"],DirToVerification)
                    table.insert(Rep[packet]["File"],confirm)
                end
            end
        end
    end
end

Init("A")
Init("B")
Init("C")

CallingRep()
DirectoryCheck()