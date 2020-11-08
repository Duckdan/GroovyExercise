package study

/**
 * Groovy方法学习
 */
int add(int a, int b = 10) {
    return a + b
}

println add(10) //20
println add(2, 4) //6

def multiply(a, b) {
    a * b
}

int subtraction(a, b) {
    a - b
}

println multiply(4, 5)  //20
println subtraction(2, 3) //-1