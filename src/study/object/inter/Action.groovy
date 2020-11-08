package study.object.inter
/**
 * 接口:
 * 一般修饰符不能存在方法体
 * default修饰时可以存在方法体
 */
interface Action {

    void play()

    default void eat(String name) {
        println "default 修饰类$name"
    }
}