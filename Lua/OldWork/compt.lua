print("Entre le type d'attente (H/M/S)")
TimerTypes = io.read()
print("Entre le montant")
TimerDelay = io.read()


if TimerTypes == "H" then
	TimerDelay = TimerDelay * 3600
end
if TimerTypes == "M" then
	TimerDelay = TimerDelay * 60
end
if TimerTypes == "S" then
	TimerDelay = TimerDelay
end
print("The value was:"..TimerDelay,TimerTypes)
TimerDelay = TimerDelay

function compteur(Name)
	os.time()
	local BaseDelay = os.time
	local InitializationDelay = BaseDelay()
	local AdditionDelay = InitializationDelay + 1
	MessageReferenceDelay = {"Start",InitializationDelay,Name}

	while (true) do

	print("var TimerDelay",TimerDelay)
	print("var ResultatDelay",ResultatDelay)

	print(ResultatDelay)
		ResultatDelay = AdditionDelay - InitializationDelay
		AdditionDelay = AdditionDelay + 1
		SaveResultatDelay = ResultatDelay
		local SpeedDelay = os.clock() + 5/10
		repeat until os.clock() > SpeedDelay

			if ResultatDelay == TimerDelay then
	break
	end
	end
end
compteur("a")
