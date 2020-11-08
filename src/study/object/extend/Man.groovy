package study.object.extend

class Man extends AbstractPerson {
    @Override
    void play() {
        println "我是继承类，$name,哈哈哈哇$age"
    }

    public static void main(String[] args) {
        Man man = new Man()
        man.name = "Groovy"
        man.age = 30
        man.play()//我是继承类，Groovy,哈哈哈哇30
    }
}
