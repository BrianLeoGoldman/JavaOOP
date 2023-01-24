package objectOrientedConcepts.inheritance;

public class Dog extends Animal { // A Dog IS AN Animal

    public void bark() {
        System.out.println("Barking to the cats...");
    }

    public void play() {
        System.out.println("Playing with a human...");
    }

    @Override
    public void eat(String food) {
        System.out.println("Eating the food " + food + " as a dog");
    }
}
