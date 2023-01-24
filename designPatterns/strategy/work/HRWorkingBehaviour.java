package designPatterns.strategy.work;

public class HRWorkingBehaviour implements WorkingBehaviour {
    @Override
    public void work() {
        String employee1 = "Gabriella";
        String employee2 = "Tomas";
        String employee3 = "Mark";
        System.out.println("Resolving issues between " + employee1 + " and " + employee2 + " and firing " + employee3);
    }
}
