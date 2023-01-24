package objectOrientedConcepts.inheritance;

abstract class Animal {
    private String name;
    private int age;

    public String getName() { // Getter for Name
        return this.name;
    }

    public int getAge() { // Getter for Age
        return this.age;
    }

    public void setName(String name) { // Setter for Name
        this.name = name;
    }

    public void setAge(int age) { // Setter for Age
        this.age = age;
    }

    abstract public void eat(String food);
}
