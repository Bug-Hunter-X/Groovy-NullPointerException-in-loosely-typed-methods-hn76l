```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    throw new IllegalArgumentException("Arguments cannot be null")
  }
  return a + b
}

println myMethod(1, 2) // 3

try {
  println myMethod(null, 2) 
} catch (IllegalArgumentException e) {
  println "Exception caught: "+ e.message
}

try {
  println myMethod(1, null)
} catch (IllegalArgumentException e) {
  println "Exception caught: "+ e.message
}

try {
  println myMethod(null, null)
} catch (IllegalArgumentException e) {
  println "Exception caught: "+ e.message
}

//Alternative solution using elvis operator
def myMethod2(a, b) {
  return (a ?: 0) + (b ?: 0)
}

println myMethod2(1,2) //3
println myMethod2(null,2) //2
println myMethod2(1,null) //1
println myMethod2(null,null) //0
```