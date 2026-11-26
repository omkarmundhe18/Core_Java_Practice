class MyThread extends Thread {

    public void run() {

        System.out.println("MyThread is Running");

    }-

    public static void main(String[] args) {

        // Creating MyThread object
        MyThread obj = new MyThread();

        // Calling run method
        obj.run();

        // Creating new Thread with name
        Thread t1 = new Thread("MyThread1");

        // Starting Thread
        t1.start();

        // Getting Thread name
        System.out.println(t1.getName());

    }
}