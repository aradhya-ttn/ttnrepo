package Question2;

import com.example.springframework.Assignment.Worker;
//(2) Write a program to demonstrate Loosely Coupled code.
public class Manager {
    private Worker lazyWorker;
    private Worker excellentWorker;


    public Manager(LazyWorker lazyWorker) {
        this.lazyWorker=lazyWorker;

    }

//    public Manager(ExcellentWorker excellentWorker) {
//        this.excellentWorker=excellentWorker;
//    }

    public  void myCall(){
        lazyWorker.doWork();
//        excellentWorker.doWork();
    }

}
