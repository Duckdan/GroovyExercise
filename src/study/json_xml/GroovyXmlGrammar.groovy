package study.json_xml

import groovy.util.slurpersupport.GPathResult
import groovy.xml.MarkupBuilder
import groovy.xml.XmlUtil

class GroovyXmlGrammar {

    static void main(String[] args) {
//        productXml()
        parseXml()
    }


    /**
     * 解析xml
     */
    private static void parseXml() {
        String xml = '''
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.example.jvm_demo_20200601">
    <test>12345</test>
    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        <activity android:name=".MainActivity2">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>
</manifest>
'''
        def xmlSlurper = new XmlSlurper()
        def result = xmlSlurper.parseText(xml)
        //取属性值
        println result.@package  //com.example.jvm_demo_20200601
        //取结点下面的文本
        println result.test.text() //12345

        ////读取有域名空间的节点
        result.declareNamespace('android': 'http://schemas.android.com/apk/res/android')
        println result.application.@'android:allowBackup'  //true
        println result.application.activity[0].@'android:name' //.MainActivity
        println result.application.activity[1].@'android:name' //.MainActivity2

        //遍历xml节点
        result.application.activity.each {
            println it.@'android:name'
        }
    }

    /**
     * 生成Xml文件，这样编写就可以输出xml到控制台
     */
    private static void productXml() {
        def mB = new MarkupBuilder()

        /**
         * <collection shelf='New Arrivals'>
         *   <movie title='Enemy Behind' />
         *   <type>War, Thriller</type>
         *   <format>DVD</format>
         *   <year>2003</year>
         *   <rating>PG</rating>
         *   <stars>10</stars>
         *   <description>Talk about a US-Japan war</description>
         * </collection>
         */
        // Compose the builder
        mB.collection(shelf: 'New Arrivals') {
            movie(title: 'Enemy Behind')
            type('War, Thriller')
            format('DVD')
            year('2003')
            rating('PG')
            stars(10)
            description('Talk about a US-Japan war')
        }
    }
}
