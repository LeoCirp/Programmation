Martin = {
    A = 1,
    B = 2
}

for _,Variable in pairs(Martin) do
    print(Variable)
    if Variable == 2 then
        print("OK")
    else
        print("pas ok")
    end
end