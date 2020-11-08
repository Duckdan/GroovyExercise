package study.collection

/**
 * GroovyList的Demo
 */
//定义List
def list = [5, 'string', true]
//变量存取：可以直接通过索引存取，而且不用担心索引越界。如果索引超过当前链表长度，List会自动
//往该索引添加null元素
list[100] = 100
println list.class //class java.util.ArrayList
println list.size()  //101

//list操作合集
def list01 = [5, 'string', true]
//1.添加
list01.add(4)
list01 << 3
println list01 //[5, string, true, 4, 3]
def newList01 = list01 + 7
println newList01//[5, string, true, 4, 3, 7]
newList01.add(0, 1) //指定下标添加元素
println newList01//[1, 5, string, true, 4, 3, 7]

//2.删除
newList01.remove(2)//移除index=2的元素
println newList01 //[1, 5, true, 4, 3, 7]
newList01.remove((Object) 7)//移除指定元素
println newList01//[1, 5, true, 4, 3]
newList01.removeElement(true)
println newList01//[1, 5, 4, 3]
newList01.removeAll { //移除集合中是偶数的函数
    it % 2 == 0
}
println newList01//[1, 5, 3]
println newList01 - [1, 3]//[5]

//3.查找
def findList = [5, -2, 4, -3, 1]
//查找满足条件的第一个元素
println findList.find { it % 2 == 0 } //-2
//查找满足条件的所有元素
println findList.findAll { it % 2 == 0 }//[-2, 4]
//查找是否存在满足条件的元素
println findList.any { it % 2 == 0 }//true
//查找是否全部满足条件
println findList.every { it % 2 == 0 }//false
//查找绝对值最小的元素
println findList.min { Math.abs(it) }  //1
//查找绝对值最大的元素
println findList.max { Math.abs(it) }//5
//统计满足元素的个数
println findList.count { it > 0 } //3

//4.排序
def sortList = [5, 7, 9, -1, 2, 10]
sortList.sort { a, b -> a == b ? 0 : Math.abs(a) > Math.abs(b) ? 1 : -1 }
println sortList//[-1, 2, 5, 7, 9, 10]
//对象排序
def sortStringList = ['aaaa', 'bbbb', 'e', 'dd', 'c']
//根据字符串长度来排序
sortStringList.sort { it.size() }
println sortStringList//[e, c, dd, aaaa, bbbb]

//定义数组
def array = [1, 3, 4, 2, 5, 7, 6] as int[]
println array.class //class [I

