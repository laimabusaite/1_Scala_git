println("Hello there Scala fans!")
//worksheet is mostly for experimenting
//think of it like a sandbox
val a = 5+6
println(a)
print("Hello")
print("hmmm ")
print(math.pow(2,32))
val b = 10
println(a + b)
//b = b + 4

var myVar = 30
myVar = myVar + 30
println(myVar)

val result = a + b
val bigResult = myVar + math.pow(2,32)
println(result.getClass, bigResult.getClass)

val myName = "Laima"
println(myName.getClass)

val singleChar = 'w'
println(singleChar.getClass)

val myByte : Byte = 120
println(myByte, myByte.getClass)
val anotherByte : Byte = 10
val resultByte = (myByte + anotherByte).toByte

val myNumberString = "12345"
val myNumber = myNumberString.toInt
