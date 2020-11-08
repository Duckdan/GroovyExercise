package study.object.normal
/**
 * 面向对象:普通类
 */
class FirstStudent {
    int studentId
    String name

    static void main(args) {
        FirstStudent student = new FirstStudent();
        student.studentId = 1
        student.name = "启航"
        println student
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                '}';
    }
}
