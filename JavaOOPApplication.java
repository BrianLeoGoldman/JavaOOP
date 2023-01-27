import designPatterns.behavioral.observer.AirConditioner;
import designPatterns.behavioral.observer.Sprinkler;
import designPatterns.behavioral.observer.WeatherStation;
import objectOrientedConcepts.abstraction.Computer;
import designPatterns.behavioral.strategy.Employee;
import designPatterns.behavioral.strategy.display.GraphicDisplayingBehaviour;
import designPatterns.behavioral.strategy.display.TextDisplayingBehaviour;
import designPatterns.behavioral.strategy.rest.HighRestingBehaviour;
import designPatterns.behavioral.strategy.rest.LowRestingBehaviour;
import designPatterns.behavioral.strategy.rest.MediumRestingBehaviour;
import designPatterns.behavioral.strategy.work.FinanceWorkingBehaviour;
import designPatterns.behavioral.strategy.work.HRWorkingBehaviour;
import designPatterns.behavioral.strategy.work.TechnicalWorkingBehaviour;
import objectOrientedConcepts.encapsulation.Car;
import objectOrientedConcepts.inheritance.Dog;
import objectOrientedConcepts.inheritance.Duck;
import objectOrientedConcepts.polymorphism.Command;
import objectOrientedConcepts.polymorphism.Executable;
import objectOrientedConcepts.polymorphism.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaOOPApplication {

        public static void main(String[] args) {
                // Encapsulation
                // encapsulationTest();

                // Abstraction
                // abstractionTest();

                // Inheritance
                // inheritanceTest();

                // Polymorphism
                // polymorphismTest();

                // Strategy Pattern
                // strategyPatternTest();

                // Observer Pattern
                observerPatternTest();
        }

        private static void encapsulationTest() {
                Car car1 = new Car("Toyota", "Corolla", "grey");
                Car car2 = new Car("Ford", "Mondeo", "blue");
                Car car3 = new Car("Chevrolet", "Camaro", "red");
                car1.start();
                car2.start();
                car1.move();
                car1.move();
                car1.stop();
                car3.stop();
        }

        private static void abstractionTest() {
                Computer myComputer = new Computer();
                myComputer.turnOn();
                myComputer.inputCommand("image", "photo.jpg");
                myComputer.inputCommand("text", "story.txt");
                myComputer.inputCommand("internet", "www.mypage.com");
                myComputer.turnOff();
                // myComputer.processImage("dog.png");
                // myComputer.playGame("Undertale"):
        }

        private static void inheritanceTest() {
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
        }

        private static void polymorphismTest() {
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

        private static void strategyPatternTest() {
                Employee employee = new Employee("John", 1);

                employee.display();
                employee.rest();
                employee.work();

                employee.setDisplayingBehaviour(new GraphicDisplayingBehaviour());
                employee.display();
                employee.setRestingBehaviour(new HighRestingBehaviour());
                employee.rest();
                employee.setWorkingBehaviour(new TechnicalWorkingBehaviour());
                employee.work();

                employee.setDisplayingBehaviour(new TextDisplayingBehaviour());
                employee.display();
                employee.setRestingBehaviour(new MediumRestingBehaviour());
                employee.rest();
                employee.setWorkingBehaviour(new FinanceWorkingBehaviour());
                employee.work();

                employee.setRestingBehaviour(new LowRestingBehaviour());
                employee.rest();
                employee.setWorkingBehaviour(new HRWorkingBehaviour());
                employee.work();
        }

        private static void observerPatternTest() {
                WeatherStation station = new WeatherStation();
                Sprinkler sprinkler1 = new Sprinkler(station);
                Sprinkler sprinkler2 = new Sprinkler(station);
                Sprinkler sprinkler3 = new Sprinkler(station);
                AirConditioner airConditioner1 = new AirConditioner(station);
                AirConditioner airConditioner2 = new AirConditioner(station);
                station.register(sprinkler1); station.register(sprinkler2); station.register(sprinkler3);
                station.register(airConditioner1); station.register(airConditioner2);
                System.out.println("Setting humidity to 46...");
                station.setHumidity(46);
                System.out.println("Setting temperature to 26...");
                station.setTemperature(26);
                System.out.println("Setting humidity to 34...");
                station.setHumidity(34);
                System.out.println("Setting temperature to 29...");
                station.setTemperature(29);
                System.out.println("Setting humidity to 31...");
                station.setHumidity(31);
                System.out.println("Setting temperature to 31...");
                station.setTemperature(31);
        }



}
