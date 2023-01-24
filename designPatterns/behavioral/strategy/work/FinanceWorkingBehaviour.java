package designPatterns.behavioral.strategy.work;

public class FinanceWorkingBehaviour implements WorkingBehaviour {
    @Override
    public void work() {
        long money1 = 30800;
        long money2 = 60900;
        long money3 = 21000;
        long money4 = 77980;
        System.out.println("Transferring " + (money1 + money2 + money3 + money4) + " to a new account");
    }
}
