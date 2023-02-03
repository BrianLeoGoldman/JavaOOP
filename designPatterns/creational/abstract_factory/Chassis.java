package designPatterns.creational.abstract_factory;

public abstract class Chassis {

    String code;

    public Chassis(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

}
