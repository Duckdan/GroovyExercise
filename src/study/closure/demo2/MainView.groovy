package study.closure.demo2

class MainView {
    public static void main(String[] args) {
        View view = new View()
        view.setOnClickListener { println it.toString() }
    }
}
