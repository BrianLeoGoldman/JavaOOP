package inheritance;

public class Duck extends Animal { // A Duck IS An Animal

    public void swim() {
        System.out.println("Swimming in the water...");
    }

    public void fly() {
        System.out.println("Flying through the sky...");
    }

    @Override
    public void eat(String food) {
        System.out.println("Eating the food " + food + " as a duck");
    }
}
