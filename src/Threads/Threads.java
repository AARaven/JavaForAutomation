package Threads;

import java.util.Arrays;

public class Threads implements Runnable {

    @Override
    public void run() {
    }

    public static void main(String[] args) throws Exception {

        Thread thread = new Thread();

        System.out.println("thread.getId()..."
                + "\t" + thread.getId());
        System.out.println("thread.getName()..."
                + "\t" + thread.getName());
        System.out.println("thread.getPriority()..."
                + "\t" + thread.getPriority());
        System.out.println("thread.getClass()..."
                + "\t" + thread.getClass());
        System.out.println("thread.getContextClassLoader()..."
                + "\t" + thread.getContextClassLoader());
        System.out.println("thread.getStackTrace()..."
                + "\t" + Arrays.toString(thread.getStackTrace()));
        System.out.println("thread.getThreadGroup()..."
                + "\t" + thread.getThreadGroup());
        System.out.println("thread.getUncaughtExceptionHandler()..."
                + "\t" + thread.getUncaughtExceptionHandler());

        System.out.println(thread);
        System.out.println(thread.isAlive());
        System.out.println(thread.isDaemon());
        System.out.println(thread.isInterrupted());

        thread.run();
        thread.setDaemon(true);
        System.out.println(thread);
        System.out.println(thread.isAlive());
        System.out.println(thread.isDaemon());
        System.out.println(thread.isInterrupted());


    }
}
