public class HelloThread extends Thread {
    public HelloThread(String name) {
        // 调用父类构造函数并设置线程名称
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Hello Thread " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

        HelloThread helloThread1 = new HelloThread("Thread-0");
        HelloThread helloThread2 = new HelloThread("Thread-1");
        HelloThread helloThread3 = new HelloThread("Malaysia");
        helloThread1.start();
        helloThread2.start();
        helloThread3.start();
    }
}