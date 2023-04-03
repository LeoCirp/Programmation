first = true
CountCycle = 0
tier = 0
heybudy = 0
countk = 0
countk2 = 0
local ab = {
    hash = 55,
    ["string"] = 55,
    [3] = 55,
    OtherTab = {
        morecontent = 55
    }
}

while true do
    CountCycle = CountCycle + 1
    if first then
        message = "Welcome User"
    else
        message = "Reload"
    end
    print(message)
    first = false

    string,boolean,init,float = "Hey",true,10,0.5
    print("Varible : ",string,boolean,init,float)

    print(CountCycle.." Cycle")

    if CountCycle == 10 then
        print("\nWow, you need help!")
        print("ok, i gonna add you one budy")
        heybudy = heybudy + 1
        CountCycle = 0
        tier = tier + 1
    end
    if not heybudy then
        print("hey no budy :(")
    end
    if heybudy then
        print(heybudy,"Budy")
    end
    input = io.read()
    if input == "0" then 
        print("I will gonna close the system, thanks for use me :)")
        print(heybudy,"Friends in total found!")
        print(tier * 10 + CountCycle,"Cycle")
        for i=0,5,1 do
            print(i.."X")
        end
        for i=5,0,-2 do
            print(i.."I2A")
        end
        print(ab)
        for k,v in pairs(ab) do
            countk = countk + 1
        end
        for k,v in pairs(ab) do
            countk2 = countk2 + 1
            countl = 5
            print(k,v)
            if countk2 <= (countl or 0) then
                print("\n[][][][][][][][]\n")
            end
            if type(v) == "table" then
                for ka,va in pairs(v) do
                    print(ka,va)
                end
            end
        end
        io.read()
        return false 
    end
end