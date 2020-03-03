package Question2;

import com.example.springframework.Assignment.Worker;

public class LazyWorker implements Worker {

    @Override
    public void doWork() {
        System.out.println("Lazy Worker is doing job");

    }
}
