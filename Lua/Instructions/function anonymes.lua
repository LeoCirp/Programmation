function newCounter()
    local i = 0
    return function() -- fonction anonyme
      i = i + 1
      return i
    end
  end
  
h2 = newCounter()
c2 = newCounter()
print(h2())  --> 1
print(h2())  --> 2
print(c2())  --> 1
print(c2())  --> 2