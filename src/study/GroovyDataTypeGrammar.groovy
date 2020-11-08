package study

/**
 * 数据类型
 */
class GroovyDataTypeGrammar {
    public static void main(String[] args) {
        int x = 5;

        long y = 100L;

        float a = 10.56f;

        double b = 10.5e40;

        BigInteger bi = 30g;

        BigDecimal bd = 3.5g;

        println(x);//5
        println(x.class);//class java.lang.Integer

        println(y);//100
        println(y.class);//class java.lang.Long

        println(a);//10.56
        println(a.class);//class java.lang.Float

        println(b);//1.05E41
        println(b.class)//class java.lang.Double

        println(bi);//30
        println(bi.class)//class java.math.BigInteger

        println(bd);//3.5
        println(bi.class)//class java.math.BigInteger
    }
}

