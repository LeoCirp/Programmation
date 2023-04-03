table = {
    "hello",
    "aurevoir"
}


for k,v in ipairs(table) do
    print(k,v)
end

tabledeux = {
    ["1"] = "Bobon",
    ["2"] = "Chocolat"
}

for k,v in pairs(tabledeux) do
    print(k,v)
end