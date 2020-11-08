package study.closure.demo2

class View {
    private Closure onClickListener
    Timer timer

    View() {
        //定时器
        timer = new Timer()
        //定时器的调度
        timer.schedule(new TimerTask() {
            @Override
            void run() {
                preOnClick()
            }
            //延迟1s之后触发，每隔3s触发一次
        }, 1000, 3000)
    }

    /**
     * 设置事件的闭包
     * @param closure
     */
    void setOnClickListener(Closure closure) {
        this.onClickListener = closure
    }

    /**
     * 执行事件的回调
     */
    private void preOnClick() {
        if (onClickListener != null) {
            //说明闭包是有参数的
            onClickListener.call(this)
        }
    }

    @Override
    String toString() {
        return "this is View"
    }
}
