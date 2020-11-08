package study.object.normal
/**
 * 内部类
 */
class OuterAndInnerClass {


    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass()
        outerClass.name="Groovy"
        outerClass.callInnerClassMethod()//我是内部类，Groovy
    }


}


class OuterClass {
    String name

    class InnerClass {
        void play() {
            println "我是内部类，$name"
        }
    }

    void callInnerClassMethod() {
        new InnerClass().play()
    }
}