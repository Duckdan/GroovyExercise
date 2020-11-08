package study.closure

/**
 * 闭包语言,用闭包当参数
 */
class GroovyClosureGrammar01 {
    public static void main(String[] args) {
        methodWithClosureParams {
            println "Hello Number::$it"
        }
    }

    def static methodWithClosureParams(closure) {
        def start = 1;
        closure.call(start)
    }
}
