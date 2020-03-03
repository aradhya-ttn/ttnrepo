package Question2;

import com.example.springframework.Assignment.Worker;

public class ExcellentWorker implements Worker {

    @Override
    public void doWork(){
        System.out.println("Excellent Worker is doing job");

    }
}
