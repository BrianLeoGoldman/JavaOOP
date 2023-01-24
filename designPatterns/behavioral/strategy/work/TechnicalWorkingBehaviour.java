package designPatterns.behavioral.strategy.work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TechnicalWorkingBehaviour implements WorkingBehaviour {
    @Override
    public void work() {
        List<String> languages = new ArrayList<>();
        languages.add("Java"); languages.add("Python"); languages.add("Ruby");
        Random rand = new Random();
        String randomElement = languages.get(rand.nextInt(languages.size()));
        System.out.println("Coding with " + randomElement);
    }
}
