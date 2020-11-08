package study.object.trait
/**
 * Flags的实现类
 */
class FlagsImpl implements Flags, Flys {
    public static void main(String[] args) {
        FlagsImpl flagsImpl = new FlagsImpl()
        flagsImpl.name = "Groovy"
        flagsImpl.play()//trait Flags play null  //null是因为trait Flys的name属性覆盖了trait Flags中的name
        flagsImpl.fly()//Groovy 可以fly
        flagsImpl.useThis()//this关键字如下，study.object.trait.FlagsImpl

    }
}
