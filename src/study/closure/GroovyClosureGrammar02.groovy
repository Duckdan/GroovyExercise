package study.closure

/**
 * Groovy的闭包程序
 */

{
    println "Hello Groovy"
}()

def scriptClosure = {
    /**
     * study.closure.GroovyClosureGrammar02@750fe12e
     * study.closure.GroovyClosureGrammar02@750fe12e
     * study.closure.GroovyClosureGrammar02@750fe12e
     */
    println this //代表闭包定义处的类,此时这个闭包是定义在GroovyClosureGrammar02这个类中
    println owner //代表闭包定义处的类或者闭包对象，此时这个闭包是定义在GroovyClosureGrammar02这个类中
    println delegate //代表任意对象，delegate默认为owner指向的对象
}
scriptClosure.call()

println "============================"

class Person {
    def static classClosure = {
        println "classClosure:" + this //classClosure:class study.closure.Person  静态闭包，指向当前类
        println "classClosure:" + owner //classClosure:class study.closure.Person  静态闭包，指向当前类
        println "classClosure:" + delegate //代表任意对象，delegate默认为owner指向的对象
        println "============================"
    }

    /**
     * 方法内定义闭包
     * @return
     */
    def static innerClosure() {
        def classClosure = {
            println "innerClosure classClosure:" + this //innerClosure classClosure:class study.closure.Person  静态闭包，指向当前类
            println "innerClosure classClosure:" + owner //innerClosure classClosure:class study.closure.Person  静态闭包，指向当前类
            println "innerClosure classClosure:" + delegate //代表任意对象，delegate默认为owner指向的对象
        }
        classClosure.call()
    }
}

Person.classClosure()
Person.innerClosure()
println "===================="
def outerClosure = {

    println "outerClosure:" + this
    //outerClosure:study.closure.GroovyClosureGrammar02@26f143ed 代表闭包定义处的类,此时这个闭包是定义在GroovyClosureGrammar02这个类中
    println "outerClosure:" + owner
    //outerClosure:study.closure.GroovyClosureGrammar02@26f143ed 代表闭包定义处的类,此时这个闭包是定义在GroovyClosureGrammar02这个类中
    println "outerClosure:" + delegate //代表任意对象，delegate默认为owner指向的对象
    def innerClosure = {
        /**
         * innerClosure:study.closure.GroovyClosureGrammar02@26f143ed
         * innerClosure:study.closure.GroovyClosureGrammar02$_run_closure2@1f9d6c7b
         * innerClosure:study.closure.GroovyClosureGrammar02$_run_closure2@1f9d6c7b
         */
        //innerClosure:study.closure.GroovyClosureGrammar02@26f143ed 代表闭包定义处的类,此时这个闭包是定义在GroovyClosureGrammar02这个类中
        println "innerClosure:" + this
        //innerClosure:study.closure.GroovyClosureGrammar02$_run_closure2@1f9d6c7b 代表闭包定义处的类或者闭包对象，此时这个闭包是定义在GroovyClosureGrammar02这个类中的outerClosure闭包中
        println "innerClosure:" + owner
        //代表任意对象，delegate默认为owner指向的对象
        println "innerClosure:" + delegate
    }
    innerClosure.call()
}
outerClosure.call()
println "================================"
Person person = new Person()
def outPersonClosure = {
    def innerPersonClosure = {
        /**
         * this代表闭包定义处的类,此时这个闭包是定义在GroovyClosureGrammar02这个类中
         * owner代表闭包定义处的类或者闭包对象，此时这个闭包是定义在outPersonClosure这个对象中
         * delegate代表person
         * innerPersonClosure:study.closure.GroovyClosureGrammar02@1af1347d
         * innerPersonClosure:study.closure.GroovyClosureGrammar02$_run_closure3@c827db
         * innerPersonClosure:study.closure.Person@377c68c6
         */
        println "innerPersonClosure:" + this
        println "innerPersonClosure:" + owner
        println "innerPersonClosure:" + delegate
    }
    //讲person委托给delegate
    innerPersonClosure.delegate = person
    innerPersonClosure.call()
}
outPersonClosure.call()

println "================================"

class Children {
    String name
    def pretty = {
//        String name="pretty" //Closure.TO_SELF
        "My name is $name"
    }

    String toString() {
        pretty.call()
    }
}

def children = new Children(name: 'Groovy')

class Parent {
    String name
}

def parent = new Parent(name: 'Gradle')
//将parent委托给children
children.pretty.delegate = parent
//闭包委托策略
children.pretty.resolveStrategy = Closure.TO_SELF
/**
 * 不设置闭包委托策略
 * My name is Groovy
 * 设置闭包委托策略 Closure.DELEGATE_FIRST //优先从delegate寻找
 * My name is Groovy
 * 设置闭包委托策略 Closure.DELEGATE_ONLY //只从delegate寻找
 * My name is Gradle
 * 设置闭包委托策略 Closure.OWNER_FIRST //优先从owner寻找
 * My name is Groovy
 * 设置闭包委托策略 Closure.OWNER_ONLY //只从owner寻找
 * My name is Groovy
 * 设置闭包委托策略 Closure.TO_SELF //从闭包内部去找，例如闭包{a}，就是从闭包{a}中寻找对应属性
 * My name is pretty
 */
println children.toString()