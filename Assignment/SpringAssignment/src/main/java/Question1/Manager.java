package Question1;
//(1) Write a program to demonstrate Tightly Coupled code.
public class Manager {
    private LazyWorker lazyWorker;
    private ExcellentWorker excellentWorker;

    Manager(LazyWorker lz, ExcellentWorker ew){
        this.lazyWorker=lz;
        this.excellentWorker=ew;
    }
    public void managedWork(){
        lazyWorker.doWork();
        excellentWorker.doWork();
    }

}
