package Thread.Executor;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//5. 创建例子的主类通过创建一个类，名为 Main 并添加 main()方法。
public class ExecutorSamples {

    public static void main(String[] args) throws Exception {

//6. 使用Executors类的newCachedThreadPool()方法创建新的 Executor 对象。
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();

//7. 创建并提交10个 Task 对象给执行者。用随机数字初始化任务。
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            ExecutorTask task = new ExecutorTask(random.nextInt(10000));
            executor.submit(task);
        }

//8. 创建迭代为5的for循环。在每步，传递执行者调用 showLog() 方法写相关信息，并让线程休眠1秒。
        for (int i = 0; i < 5; i++) {
            showLog(executor);
            TimeUnit.SECONDS.sleep(1);
        }

//9. 使用 shutdown() 方法关闭执行者。
        executor.shutdown();

//10. 另创建迭代为5的for循环。在每步，传递执行者调用 showLog() 方法写相关信息，并让线程休眠1秒。
        for (int i = 0; i < 5; i++) {
            showLog(executor);
            TimeUnit.SECONDS.sleep(1);
        }

//11. 使用 awaitTermination() 方法等待执行者的终结。
        executor.awaitTermination(1, TimeUnit.DAYS);

//12. 显示一条结束程序的信息。
//        System.out.printf("Main: End of the program.\n");
    }

    //13. 实现 showLog() 方法，接收 Executor 作为参数。写关于pool的大小，任务的数量，和执行者状态的信息。
    private static void showLog(ThreadPoolExecutor executor) {
        System.out.printf("*********************");
        System.out.printf("Main: Executor Log");
        System.out.printf("Main: Executor: Core Pool Size:%d\n", executor.getCorePoolSize());
        System.out.printf("Main: Executor: Pool Size: %d\n", executor.getPoolSize());
        System.out.printf("Main: Executor: Active Count:%d\n", executor.getActiveCount());
        System.out.printf("Main: Executor: Task Count: %d\n", executor.getTaskCount());
        System.out.printf("Main: Executor: Completed Task Count:%d\n", executor.getCompletedTaskCount());
        System.out.printf("Main: Executor: Shutdown: %s\n", executor.isShutdown());
        System.out.printf("Main: Executor: Terminating:%s\n", executor.isTerminating());
        System.out.printf("Main: Executor: Terminated: %s\n", executor.isTerminated());
        System.out.printf("*********************\n");
    }
}
