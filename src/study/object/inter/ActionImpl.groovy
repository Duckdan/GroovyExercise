package study.object.inter

/**
 * 当接口中存在用default修饰的方法时，该方法必须包含函数体
 * 如果存在类实现了该接口，此时接口将会丧失约束的作用。因为这个时候
 * 类不重写接口中未实现的方法也不会报编译时错误，不过运行程序的时候
 * 仍旧会报错，说用户没有实现接口中未实现的方法
 */
class ActionImpl implements Action {

    @Override
    void play() {
        println "我是未实现方法"
    }

    public static void main(String[] args) {
        ActionImpl actionImpl = new ActionImpl()
        actionImpl.eat("大米") //default 修饰类大米
        actionImpl.play() //我是未实现方法
    }
}
