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
class DefaultConfig {
    private int mMinSdkVersion
    private int mTargetSdkVersion
    private int mVersionCode
    private String mVersionName

    int getMinSdkVersion() {
        return mMinSdkVersion
    }

    void setMinSdkVersion(int minSdkVersion) {
        this.mMinSdkVersion = minSdkVersion
    }

    int getTargetSdkVersion() {
        return mTargetSdkVersion
    }

    void setTargetSdkVersion(int targetSdkVersion) {
        this.mTargetSdkVersion = targetSdkVersion
    }

    int getVersionCode() {
        return mVersionCode
    }

    void setVersionCode(int versionCode) {
        this.mVersionCode = versionCode
    }

    String getVersionName() {
        return mVersionName
    }

    void setVersionName(String versionName) {
        this.mVersionName = versionName
    }




    @Override
    public String toString() {
        return "DefaultConfig{" +
                "mMinSdkVersion=" + mMinSdkVersion +
                ", mTargetSdkVersion=" + mTargetSdkVersion +
                ", mVersionCode=" + mVersionCode +
                ", mVersionName='" + mVersionName + '\'' +
                '}';
    }
}
