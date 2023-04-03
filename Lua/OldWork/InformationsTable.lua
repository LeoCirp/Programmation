tab = {}
for j = 0,24,1 do
    table.insert(tab,math.random(0,100))
end
print ("Ref")
for k,v in pairs (tab) do
	print(v)
end
print ("Ref")
IndiceDepart = io.read()
OrdreLecture = io.read()
i = IndiceDepart
if OrdreLecture ~= "Ascendant" then

    while i ~= 0 do
        print(tab[i])
        i = i - 1
    end
else
    while i ~= 25 do
        print(tab[i])
        i = i + 1
    end
end
