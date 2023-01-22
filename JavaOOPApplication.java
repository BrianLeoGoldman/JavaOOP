import abstraction.Computer;
import encapsulation.Car;
import inheritance.Dog;
import inheritance.Duck;
import polymorphism.Command;
import polymorphism.Executable;
import polymorphism.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaOOPApplication {

        public static void main(String[] args) {

                // Encapsulation
                Car car1 = new Car("Toyota", "Corolla", "grey");
                Car car2 = new Car("Ford", "Mondeo", "blue");
                Car car3 = new Car("Chevrolet", "Camaro", "red");
                car1.start();
                car2.start();
                car1.move();
                car1.move();
                car1.stop();
                car3.stop();

                // Abstraction
                Computer myComputer = new Computer();
                myComputer.turnOn();
                myComputer.inputCommand("image", "photo.jpg");
                myComputer.inputCommand("text", "story.txt");
                myComputer.inputCommand("internet", "www.mypage.com");
                myComputer.turnOff();
                // myComputer.processImage("dog.png");
                // myComputer.playGame("Undertale"):

                // Inheritance
                Duck animal1 = new Duck();
                Dog animal2 = new Dog();
                animal1.setName("Ducky"); animal1.setAge(2);
                animal2.setName("Rocky"); animal2.setAge(5);
                animal1.eat("Grass");
                animal2.eat("Meat");
                animal1.swim();
                animal1.fly();
                animal2.bark();
                animal2.play();
                System.out.println("The duck is called " + animal1.getName() + " and is " + animal1.getAge() + " years old");
                System.out.println("The dog is called " + animal2.getName() + " and is " + animal2.getAge() + " years old");

                // Polymorphism
                Command executable1 = new Command();
                Order executable2 = new Order();
                Command executable3 = new Command();
                Command executable4 = new Command();
                Order executable5 = new Order();
                List<Executable> executableList = new ArrayList<>();
                executableList.add(executable1);
                executableList.add(executable2);
                executableList.add(executable3);
                executableList.add(executable4);
                executableList.add(executable5);
                List<String> results = executableList.stream().map(Executable::execute).collect(Collectors.toList());
                for (String s : results) {
                        System.out.println(s);
                }
        }

}