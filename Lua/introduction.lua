Variable_String = "string"
Variable_Number = 123 -- float return number in lua
Variable_Boolean = true

Table_Model1 = {
    ["key"] = "valeur 1",
    ["key2"] = "valeur 2"
}
Table_Model2 = {
    "valeur A",
    55
}
Table_Model3 = {
    keyName = "contenu",
    KeyName2 = "hey"
}
Table_Model1_Call = Table_Model1["key"] -- retourner valeur 1
Table_Model2_Call = Table_Model2[2] -- retrouner 55, la cle est numerique (1,2,3..) utiliser la fonction (ipairs)
Table_Model3_Call = Table_Model3.KeyName2 -- retorune "hey"

Table_Complexe = {
    Axe = {
        X = 5,
        Y = 2
    },
    Name = "Bob",
    55
}
Table_Complexe_Call = Table_Complexe.Axe.X -- retorune 5

variable_controle = "Bonjour"

if variable_controle == "Bonjour" then
    print("Bonjour a toi aussi")
else
    print("Bonjour")
end

while variable_controle == "Aurevoir" do
    print("il n'est pas la :(")
    variable_controle = io.read() -- fonction permet ineteragire avec la console dans LUA pure seulement
end

variable_controle = 5

for i=variable_controle,10,2 do
    print(variable_controle.."next")
end

for i=100,0,-5 do
    variable_controle = i
end
print(variable_controle)

for k,v in pairs(Table_Complexe) do
    print(k,v)
    print(type(v))
end

function name(hello,body)
    if true then
    
    else
    
    end
    while hello do
        if body == nil then
            break
        end
    end
end