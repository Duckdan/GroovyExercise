package study

import groovy.io.FileType

/**
 * 文件操作
 */
class GroovyFileGrammar {

    public static void main(String[] args) {
//        println readFile02()
//        readFileByte("./GroovyStudy.iml")
//        testCurrentPathIsFile("G:/")
//        createFileDirectory("G:/yangminghan")
//        deleteFile("G:/yangminghan")
//        copyFile()
//        listFile("src/study")
        listEachFile("G:/MustSpace/001_GradleSpace/GroovyStudy")
    }

    /**
     * 读文件
     * @return
     */
    private static void readFile() {
        new File("./GroovyStudy.iml").eachLine {
            println(it)
        }
    }

    /**
     * 读文件
     * @return
     */
    private static void readFile01() {
        new File("./GroovyStudy.iml").eachLine {
            line -> println("line:${line}")
        }
    }

    /**
     * 读取文件的内容到字符串
     */
    private static String readFile02() {
        return new File("./GroovyStudy.iml").text
    }

    /**
     * 读取文件的大小
     */
    private static void readFileByte(String path) {
        println "文件位置为$path,文件大小是${new File(path).length()} bytes"
    }

    /**
     * 写文件
     */
    private static void writeFile() {
        new File("./a.txt").withWriter("utf-8") {
            it.writeLine "哇哈哈，哈哈哇"
        }
    }

    /**
     * 写文件
     */
    private static void writeFile01() {
        new File("./a.txt").withWriter("utf-8") {
            writer -> writer.writeLine '写文件1，写文件1，写文件1'
        }
    }

    /**
     * 测试是否是文件
     */
    private static void testCurrentPathIsFile(String path) {
        println "当前路径是否是文件，${new File(path).isFile()}" //false
        println "当前路径是否是文件，${new File(path).isDirectory()}"//true
    }

    /**
     * 创建文件夹
     */
    private static void createFileDirectory(String path) {
        def file = new File(path);
        def mkdir = file.mkdir()
        println "文件创建成功${mkdir}" //文件创建成功true
    }

    /**
     * 删除文件夹
     * @param path
     */
    private static void deleteFile(String path) {
        def delete = new File(path).delete()
        println "文件是否删除成功${delete}"
    }

    /**
     * 复制文件
     */
    private static copyFile() {
        def src = new File("./a.txt")
        def dest = new File("./b.txt")
        dest << src.text
    }

    /**
     * 获取目录下面的文件
     */
    private static listFile(String path) {
        new File(path).listFiles().each {
            println "当前文件夹路劲，${it.absolutePath}"
        }
    }

    /**
     * 递归显示目录及其子目录中的所有文件
     */
    private static listEachFile(String path) {
        new File(path).eachFileRecurse(FileType.DIRECTORIES) {
            println it.absolutePath
        }
    }
}


