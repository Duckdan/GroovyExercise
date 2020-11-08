package study.closure.imitate_android

class FieldDefaultConfig {
    int minSdkVersion
    int targetSdkVersion
    int versionCode
    String versionName


    @Override
    public String toString() {
        return "FieldDefaultConfig{" +
                "minSdkVersion=" + minSdkVersion +
                ", targetSdkVersion=" + targetSdkVersion +
                ", versionCode=" + versionCode +
                ", versionName='" + versionName + '\'' +
                '}';
    }
}
