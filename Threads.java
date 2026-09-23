class MyThread extends Thread {

    public void run() {
        System.out.println("Hello from MyThread");
    }
}

class Threads {

    public static void main(String[] args) {

        System.out.println("Hello from main");

        MyThread t = new MyThread();

        t.start();

        System.out.println("Bye from main");
    }
}