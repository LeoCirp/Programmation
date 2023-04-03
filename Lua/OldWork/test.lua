function split(second)
	local time = os.time() + second
	origin = os.time()
	while os.time < time do end
	print("Stape done",time - origin)
end
split(5)