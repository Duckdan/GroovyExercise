package study

import groovy.text.SimpleTemplateEngine

/**
 * 模板语言
 */
class GroovyTemplateGrammar {
    public static void main(String[] args) {
//        method00()
//        method01()
    }

    private static void method00() {
        def text = 'This Tutorial focuses on $TutorialName. In this tutorial you will learn about $Topic'

        def binding = ["TutorialName": "Groovy", "Topic": "Templates"]
        def engine = new SimpleTemplateEngine()
        def template = engine.createTemplate(text).make(binding)

        println template
    }

    /**
     * 读取模板文件
     */
    private static void method01() {
        def file = new File("./Student.template")
        def binding = ['name': 'Joe', 'id': 1, 'subject': 'Physics']

        def engine = new SimpleTemplateEngine()
        def template = engine.createTemplate(file)
        def writable = template.make(binding)

        println writable
    }
}
