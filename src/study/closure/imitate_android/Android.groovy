package study.closure.imitate_android

//android {
//    compileSdkVersion 25
//    buildToolsVersion "25.0.2"
//
//    defaultConfig {
//        minSdkVersion 15
//        targetSdkVersion 25
//        versionCode 1
//        versionName "1.0"
//    }
//}
/**
 * 模仿app/build.gradle的实现
 *
 */
class Android {
    private int mCompileSdkVersion
    private String mBuildToolsVersion
    private DefaultConfig defaultConfig

    Android() {
        this.defaultConfig = new DefaultConfig()
    }

    int getCompileSdkVersion() {
        return mCompileSdkVersion
    }

    void setCompileSdkVersion(int compileSdkVersion) {
        this.mCompileSdkVersion = compileSdkVersion
    }

    String getBuildToolsVersion() {
        return mBuildToolsVersion
    }

    void setBuildToolsVersion(String buildToolsVersion) {
        this.mBuildToolsVersion = buildToolsVersion
    }

    void setDefaultConfig(Closure closure) {
        closure.setDelegate(defaultConfig)
        closure.setResolveStrategy(Closure.DELEGATE_FIRST)
        closure.call()
    }


    @Override
    public String toString() {
        return "Android{" +
                "mCompileSdkVersion=" + mCompileSdkVersion +
                ", mBuildToolsVersion='" + mBuildToolsVersion + '\'' +
                ", defaultConfig=" + defaultConfig +
                '}';
    }
}
