package Question1;

public class Main {
    public static void main(String[] args) {
        Manager manager= new Manager(new LazyWorker(),new ExcellentWorker());
        System.out.println("this is tightly coupled ----------------");
        manager.managedWork();

    }
}
