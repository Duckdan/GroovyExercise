package study.closure.demo1

/**
 * 闭包示例(this/owner/delegate)
 */
class Animal {
    String name
    int age

    void action(String action) {
        println "${action}很有难度"
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
