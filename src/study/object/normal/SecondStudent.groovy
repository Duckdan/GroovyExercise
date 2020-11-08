package study.object.normal

/**
 * 普通类
 */
class SecondStudent {
    private String name
    private int age

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    int getAge() {
        return age
    }

    void setAge(int age) {
        this.age = age
    }


    public static void main(String[] args) {
        SecondStudent student = new SecondStudent()
        student.name = "哇哈哈哈"
        student.age = 12
        println student
    }

    @Override
    public String toString() {
        return "SecondStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
