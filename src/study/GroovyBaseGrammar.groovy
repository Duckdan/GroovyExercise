package study

import java.lang.reflect.Array

/**
 * 基本数据类型
 */
class GroovyBaseGrammar {
    public static void main(String[] args) {
        //        method01()
        //        method02()
//        method03()
                method04()
        //        method05()
    }


    private static void method01() {
        String temp = "Hello World"
        println(temp[4])  //o
        println(temp[-1])//d
        println(temp[1..3])//ell
        println(temp[4..2])//oll
    }

    public static method02() {
        String temp = "Hello"
        println((temp * 3).length())//15
        println("Hello" * 3)//HelloHelloHello
    }

    static method03() {
        String hello = "Hello"
        println(hello.center(10, 'a'))//aaHelloaaa
    }

    static method04() {
        String world = "Hello Groovy"
        world.eachMatch(".") {
            println "当前字符$it"
        }
    }

    private static void method05() {
        def emmabe = [1, 3, [5, 6], 7, 8]
        emmabe.each {
            println(it)
        }
    }
}
