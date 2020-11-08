package study.closure.imitate_android

class MainAndroid {
    public static void main(String[] args) {
        methodByField()
    }

    private static void methodByField() {
//闭包定义，属性要用"="
        def android = {
            compileSdkVersion = 25
            buildToolsVersion = "25.0.2"
            defaultConfig {
                minSdkVersion = 15
                targetSdkVersion = 25
                versionCode = 1
                versionName = "1.0"
            }
        }

//调用
        FieldAndroid bean = new FieldAndroid()
        android.delegate = bean
        //去对应对象中找到相应属性进行赋值
        android.call()
        //FieldAndroid{compileSdkVersion=25, buildToolsVersion='25.0.2', defaultConfig=FieldDefaultConfig{minSdkVersion=15, targetSdkVersion=25, versionCode=1, versionName='1.0'}}
        println bean.toString()
    }

    private static void methodByMethod() {
//闭包定义,方法可以直接调用。方法直接调用时，如果只有一个参数，那么则可以省略括号
        def android = {
            setCompileSdkVersion 25
            setBuildToolsVersion "25.0.2"
            setDefaultConfig {
                setMinSdkVersion 15
                setTargetSdkVersion 25
                setVersionCode 1
                setVersionName "1.0"
            }
        }

//调用
        Android bean = new Android()
        android.delegate = bean
        //去对应对象中找到相应方法进行赋值
        android.call()
        //Android{mCompileSdkVersion=25, mBuildToolsVersion='25.0.2', defaultConfig=DefaultConfig{mMinSdkVersion=15, mTargetSdkVersion=25, mVersionCode=1, mVersionName='1.0'}}
        println bean.toString()
    }
}
