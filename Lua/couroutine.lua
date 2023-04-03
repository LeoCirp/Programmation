co = coroutine.create(function ()
    print("hi")
  end)
print(co)   --> thread: 0x8071d98
print(coroutine.status(co))   --> suspended
coroutine.resume(co)   --> hi
co = coroutine.create(function ()
    for i=1,10 do
      print("co", i)
      coroutine.yield()
    end
  end)
  coroutine.resume(co)    --> co   1
  coroutine.resume(co)    --> co   2
  coroutine.resume(co)    --> co   3
  coroutine.resume(co)    --> co   4
  print(coroutine.resume(co))
  coroutine.resume(co)    --> co   5
  coroutine.resume(co)    --> co   6
  coroutine.resume(co)    --> co   7
  coroutine.resume(co)    --> co   8
  coroutine.resume(co)    --> co   9
  coroutine.resume(co)    --> co   10
  coroutine.resume(co)    --> nothing
  print(coroutine.resume(co))
    --> false   cannot resume dead coroutine
    co = coroutine.create(function (a,b,c)
        print("co", a,b,c)
      end)
 coroutine.resume(co, 1, 2, 3)    --> co  1  2  3


 co = coroutine.create(function (a,b)
    coroutine.yield(a + b, a - b)
  end)
print(coroutine.resume(co, 20, 10))  --> true  30  10