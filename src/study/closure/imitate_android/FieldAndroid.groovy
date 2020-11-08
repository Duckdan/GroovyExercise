package study.closure.imitate_android

class FieldAndroid {
    int compileSdkVersion
    String buildToolsVersion
    FieldDefaultConfig defaultConfig

    FieldAndroid() {
        this.defaultConfig = new FieldDefaultConfig()
    }


    void defaultConfig(Closure closure) {
        closure.setDelegate(defaultConfig)
        closure.setResolveStrategy(Closure.DELEGATE_FIRST)
        closure.call()
    }


    @Override
    public String toString() {
        return "FieldAndroid{" +
                "compileSdkVersion=" + compileSdkVersion +
                ", buildToolsVersion='" + buildToolsVersion + '\'' +
                ", defaultConfig=" + defaultConfig +
                '}';
    }
}
