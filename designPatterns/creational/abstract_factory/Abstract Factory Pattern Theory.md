# Abstract Factory

Abstract Factory design pattern is one of the Creational pattern. Abstract Factory pattern is almost similar to 
Factory Pattern and is considered as another layer of abstraction over factory pattern. Abstract Factory patterns 
work around a super-factory which creates other factories. Abstract factory pattern implementation provides us with 
a framework that allows us to create objects that follow a general pattern. So at runtime, the abstract factory is 
coupled with any desired concrete factory which can create objects of the desired type.

Abstract Factory provides interfaces for creating families of related or dependent objects without specifying their 
concrete classes. Client software creates a concrete implementation of the abstract factory and then uses the 
generic interfaces to create the concrete objects that are part of the family of objects. The client does not know 
or care which concrete objects it gets from each of these concrete factories since it uses only the generic 
interfaces of their products.

### Implementation

Suppose we want to build a global car factory. If it was a factory design pattern, then it was suitable for a 
single location. But for this pattern, we need multiple locations and some critical design changes. We need car 
factories in each location like IndiaCarFactory, USACarFactory, and DefaultCarFactory. Now, our application should 
be smart enough to identify the location where it is being used, so we should be able to use the appropriate car 
factory without even knowing which car factory implementation will be used internally. This also saves us from 
someone calling the wrong factory for a particular location. Here we need another layer of abstraction that will 
identify the location and internally use the correct car factory implementation without even giving a single hint 
to the user. This is exactly the problem, which an abstract factory pattern is used to solve.

We start by classifying the different types of cars with an enum:

    enum CarType {
        MICRO, MINI, LUXURY
    }

We have an abstract class that will represent all types of cars:

    abstract class Car {
        
        Car(CarType model, Location location) {
            this.model = model;
            this.location = location;
        }

        abstract void construct();
  
        CarType model = null;
        Location location = null;
  
        CarType getModel() {
            return model;
        }
  
        void setModel(CarType model) {
            this.model = model;
        }
  
        Location getLocation() {
            return location;
        }
  
        void setLocation(Location location) {
            this.location = location;
        }
  
        @Override
        public String toString() {
            return "CarModel - "+model + " located in "+location;
        }
    }

We also have concrete classes that will extend the Car class, like a Luxury Car:

    class LuxuryCar extends Car {
    
        LuxuryCar(Location location) {
            super(CarType.LUXURY, location);
            construct();
        }

        @Override
        protected void construct() {
            System.out.println("Connecting to luxury car");
        }
    }

Or a Micro Car that also extends the Car class:

    class MicroCar extends Car {

        MicroCar(Location location) {
            super(CarType.MICRO, location);
            construct();
        }

        @Override
        protected void construct() {
            System.out.println("Connecting to Micro Car ");
        }
    }

And also a third type of Car, the Micro Car:

    class MiniCar extends Car {

        MiniCar(Location location) {
            super(CarType.MINI,location );
            construct();
        }

        @Override
        void construct() {
            System.out.println("Connecting to Mini car");
        }
    }

We also classify the different locations with an enum:

    enum Location {
        DEFAULT, USA, INDIA
    }

And now we get different types of Car Factories based on the location used. For example, if the location is India:

    class INDIACarFactory {

        static Car buildCar(CarType model) {
            Car car = null;
            switch (model) {
                case MICRO:
                    car = new MicroCar(Location.INDIA);
                    break;

                case MINI:
                    car = new MiniCar(Location.INDIA);
                    break;
                 
                case LUXURY:
                    car = new LuxuryCar(Location.INDIA);
                    break;
                 
                default:
                break;
             
            }
            return car;
        }
    }

Or if we get the default location:

    class DefaultCarFactory {

        public static Car buildCar(CarType model) {
            Car car = null;
            switch (model) {
                case MICRO:
                    car = new MicroCar(Location.DEFAULT);
                    break;

                case MINI:
                    car = new MiniCar(Location.DEFAULT);
                    break;
                 
                case LUXURY:
                    car = new LuxuryCar(Location.DEFAULT);
                    break;
                 
                    default:
                    break;
             
            }
            return car;
        }
    }

Or if we get USA as location:

    class USACarFactory {
        
        public static Car buildCar(CarType model) {
            Car car = null;
            switch (model) {
                case MICRO:
                    car = new MicroCar(Location.USA);
                    break;

                case MINI:
                    car = new MiniCar(Location.USA);
                    break;
                 
                case LUXURY:
                    car = new LuxuryCar(Location.USA);
                    break;
                 
                    default:
                    break;
             
            }
            return car;
        }
    }

And also we have the CarFactory class that chooses the correct Car Factory based on the location:

    class CarFactory {

        private CarFactory() {

        }

        public static Car buildCar(CarType type) {
            Car car = null;
            // We can add any GPS Function here which
            // read location property somewhere from configuration
            // and use location specific car factory
            // Currently I'm just using INDIA as Location
            Location location = Location.INDIA;
         
            switch(location) {
                case USA:
                    car = USACarFactory.buildCar(type);
                    break;
                 
                case INDIA:
                    car = INDIACarFactory.buildCar(type);
                    break;
                     
                default:
                    car = DefaultCarFactory.buildCar(type);
 
            }
         
            return car;
 
        }
    }

