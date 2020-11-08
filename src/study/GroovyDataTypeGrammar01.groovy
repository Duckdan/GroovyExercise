package study

def x = 1
def y = 10.24
def z = "Groovy"
def b = true

println x.class  //class java.lang.Integer
println y.class  //class java.math.BigDecimal
println z.class  //class java.lang.String
println b.class  //class java.lang.Boolean

x = 'Hello Groovy'
y = "Hello Groovy"
z = '''Hello,
Groovy
'''

println x
println y
println z

def range = 5..10
println range
println range.get(2)
range.each {
    println "当前下标${range.indexOf(it)},当前值为:${it}"
}

