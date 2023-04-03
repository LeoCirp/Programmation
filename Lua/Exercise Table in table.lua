T = {
    Message = "Bonjour utilisateur"
}


T.save = {T}

for k,v in pairs (T.save) do
    print(k,v)
    for k,v in pairs(v) do
        print(k,v)
    end
end