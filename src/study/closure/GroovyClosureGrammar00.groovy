package study.closure

/**
 * 闭包语言  可以利用groovyc GroovyClosureGrammar00.groovy编译出class文件
 */

//{
//    println "Hello Groovy $it"
//}("2020")
//
//def closure = {
//    params -> println "Hello Groovy $params"
//}
//closure.call(2020)

class GroovyClosureGrammar00 {

    public static void main(String[] args) {
        def closure = {
            params -> println "Hello Groovy $params"
        }
        closure(2020)
    }

    private static void method00() {
        def closure00 = {
            println "Hello Groovy"
        }
        closure00()
    }


    private static void method01() {
        def closure01 = {
            println "Hello $it";
        }

        closure01.call("Java")
    }

    private static void method02() {
        def closure02 = {
            params -> println "Hello $params"
        }

        closure02.call("C#")
    }

    private static void closure03() {
        def closure03 = {
            println "Hello $it"
            return "123"
        }
        println "return::${closure03.call("C++")}"
    }
}

//class MethodWithClosure {
//    def static Display(clo) {
//        clo.call("Groovy");
//    }
//
//    static void main(String[] args) {
//        def str1 = "Hello";
//        def clos = { param -> println "${str1} ${param}" }
//        clos.call("World"); //Hello World
//
//        str1 = "Welcome"; //Welcome World
//        clos.call("World"); //Welcome Groovy
//
//        MethodWithClosure.Display(clos);
//    }
//}
