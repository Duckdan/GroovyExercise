package study

/**
 * 元编程
 */
class GroovyYuanGrammar {

}

class Example00 {
    static void main(String[] args) {
        Student01 mst = new Student01();
        mst.Name = "Joe";
        mst.ID = 1;

        /**
         * setProperty Name,Joe
         * setProperty ID,1
         * Name getProperty
         * Joe
         * ID getProperty
         * 1
         * Missing method
         */
        println(mst.Name);//Joe
        println(mst.ID);//1
        mst.AddMarks()//Missing method
    }
}

class Student01 implements GroovyInterceptable {
    protected dynamicProps = [:]

    void setProperty(String pName, val) {
        println "setProperty $pName,$val"
        dynamicProps[pName] = val
    }

    def getProperty(String pName) {
        println "$pName getProperty"
        dynamicProps[pName]
    }
//    def invokeMethod(String name, Object args) {
//        return "called invokeMethod $name $args"
//    }
    /**
     * Groovy支持methodMissing的概念。
     * 此方法与invokeMethod的不同之处在于，它仅在失败的方法分派的情况下被调用，
     * 当没有找到给定名称和/或给定参数的方法时。以下示例显示如何使用methodMissing。
     * @param name
     * @param args
     * @return
     */
    def methodMissing(String name, def args) {
        println "Missing method"
    }
}

