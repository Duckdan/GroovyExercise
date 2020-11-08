package study.closure.demo1

/**
 * 闭包示例(this/owner/delegate)
 */
class Main {

    void action(String action) {
        println "${action}很容易啊"
    }

    def closure = {
        name = "老虎"
        age = 26
        action "游泳"
    }

    static void main(args) {
        Main main = new Main()
        Animal animal = new Animal(name: "鳄鱼", age: 12)
        println animal.toString() //Animal{name='鳄鱼', age=12}
        //将animal交给main.closure.delegate代理
        main.closure.delegate = animal
        main.closure.resolveStrategy=Closure.DELEGATE_FIRST
        //闭包运行，给代理对象赋值
        main.closure()
        //main.closure.resolveStrategy=Closure.DELEGATE_FIRST   游泳很有难度
        //OWNER_FIRST  resolveStrategy默认值  游泳很容易啊
        println animal.toString()//Animal{name='老虎', age=26}
    }
}
