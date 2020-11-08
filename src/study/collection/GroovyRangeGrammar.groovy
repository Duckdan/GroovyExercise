package study.collection

/**
 * 范围编程
 */
def range = 10..1//虽然反转了，但是起点仍然是1，终点仍然是10
println "当前这个范围是否反转，${range.isReverse()}"
println range[0]
println range.contains(8)
def range1 = 10..1
println range1.from //起点  1
println range1.to//终点  10

println "====================="
//遍历
range.each { println it }
println "====================="
for (i in range) {
    println i
}
println "====================="


//获得成绩等级,默认返回最后一行
def getGrade(Number score) {
    switch (score) {
        case 0..<60:
            result = '不及格'
            break;
        case 60..100:
            result = '及格'
            break;
        default:
            result = '输入异常'
    }
}

println getGrade(50)
println getGrade(80)
println getGrade(120)

/**
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 左闭右开
 */
(1..<8).each {
    println it
}