package study.collection

/**
 * 针对map集合的操作
 */

def key1 = "wahaha"
def map = [(key1): "value1", name: "ymh"]
println map//[wahaha:value1, name:ymh]

def colors = [red: '#ff0000', green: '#00ff00', blue: '#0000ff']
println colors['red']  //#ff0000
println colors.red //#ff0000

println colors.getClass()//class java.util.LinkedHashMap
println colors//[red:#ff0000, green:#00ff00, blue:#0000ff]

//添加元素
colors.yellow = "#ffff00"
println colors//[red:#ff0000, green:#00ff00, blue:#0000ff, yellow:#ffff00]

//添加集合对象
colors.map = [key1: 1, key2: 2]
println colors.toMapString()//[red:#ff0000, green:#00ff00, blue:#0000ff, yellow:#ffff00, map:[key1:1, key2:2]]

//遍历map
def teachers = [
        1: [number: '001', name: 'tom'],
        4: [number: '004', name: 'tony'],
        3: [number: '003', name: 'jerry'],
        2: [number: '002', name: 'jok'],
        5: [number: '005', name: 'jack'],
        6: [number: '006', name: 'xiao ma'],
        8: [number: '008', name: 'rain'],
        7: [number: '007', name: 'nua'],
        9: [number: '009', name: 'tony']
]
//用键值对的方式
teachers.each {
    def key, def value ->
        println "key=$key----value=$value"
}
println "===================================================="
teachers.each {
    println it.class//class java.util.LinkedHashMap$Entry
    println "key:${it.key}====value:${it.value}"
}
//带索引的方式
teachers.eachWithIndex { def teacher, int index ->
    println "下标index==$index--key=${teacher.key}--value=${teacher.value}"
}
teachers.eachWithIndex { it, int index ->
    println "一个参数：下标index==$index--key=${it.key}--value=${it.value}"
}
teachers.eachWithIndex { def key, def value, int index ->
    println "下标index==$index--key=${key}--value=${value}"
}
//map的查找
println teachers.find { it.value.name == 'tony' }//4={number=004, name=tony}
println teachers.findAll { it.value.name == 'tony' }//[4:[number:004, name:tony], 9:[number:009, name:tony]]
println teachers.count { it.value.name == 'tony' }//2

//实现嵌套查询
println teachers.findAll { it.value.name == 'tony' }.collect() { it.value.number }
//实现分组查询
println teachers.groupBy { it.value.name == 'tony' ? 'group1' : 'group2' }
//排序，根据key值来排序
println teachers.sort { t1, t2 -> t1.key > t2.key ? 1 : -1 }

