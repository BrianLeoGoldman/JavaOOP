package designPatterns.creational.singleton;

public class Manager {

    private static Manager instance;

    private int code = 0;

    private Manager() {

    }

    public static Manager getInstance() {
        if (instance == null) {
            instance = new Manager();
        }
        return instance;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
