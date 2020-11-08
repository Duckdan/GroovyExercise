package study.json_xml

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

/**
 * Json解析
 */
class GroovyJsonGrammar {
    public static void main(String[] args) {
//        parseJson()
        outputJson()
    }

    private static void outputJson() {
        def list = [new Children(name: "xm", age: 18), new Children(name: "xh", age: 25)]
        def json = JsonOutput.toJson(list)
        println json//[{"age":18,"name":"xm"},{"age":25,"name":"xh"}]
        println json.class//class java.lang.String
        println JsonOutput.prettyPrint(json)  //格式化json
    }

    /**
     * 解析json
     */
    private static void parseJson() {
        def jsonSlurper = new JsonSlurper()
        def jsonData = jsonSlurper.parseText('{ "name": "Tony", "ID" : "12345"}')
        println "${jsonData.name}====${jsonData.ID}"//Tony====12345

        def object2 = jsonSlurper.parse('[{"name":"Tony","age":"123"},{"name":"Jack","age":"456"}]'.getBytes())
        println object2 //[[name:Tony, age:123], [name:Jack, age:456]]
        println object2[0] //[name:Tony, age:123]
        println object2[1].name//Jack
    }
}
