package abstraction;

public class Computer {

    public void turnOn() { // Public method
        System.out.println("Turning on the computer");
    }

    public void inputCommand(String command, String value) { // Public method
        switch (command) {
            case "image" -> this.processImage(value);
            case "text" -> this.processText(value);
            case "internet" -> this.connectToTheWeb(value);
            default -> System.out.println("Nothing to do...");
        }
    }

    public void turnOff() { // Public method
        System.out.println("Turning off the computer");
    }

    private void processImage(String image) { // Private method
        System.out.println("Processing image " + image);
    }

    private void processText(String text) { // Private method
        System.out.println("Processing text " + text);
    }

    private void connectToTheWeb(String webPage) { // Private method
        System.out.println("Connecting to " + webPage);
    }

    protected void playGame(String game) { // Protected method
        System.out.println("Playing " + game);
    }
}
