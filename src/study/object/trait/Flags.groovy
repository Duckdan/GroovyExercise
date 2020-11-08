package study.object.trait
/**
 * 特征：Groovy相对于java的特殊用法
 * trait是一组可重用的方法和字段，可以将它们混入到一个或多个类中。一个类可以同时拥有多个trait而不需要使用多重继承（从而避免钻石问题）。
 * 方法不允许空实现
 */
trait Flags {
    String name

    void play() {
        println "trait Flags play $name"
    }

    /**
     * this关键字如下，study.object.trait.FlagsImpl
     * this代表当前Flags的实现类
     */
    void useThis() {
        println "this关键字如下，${this.class.name}"
    }

}