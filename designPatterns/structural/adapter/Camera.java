package designPatterns.structural.adapter;

public class Camera {

    private final String secretCode;

    public Camera(String secretCode) {
        this.secretCode = secretCode;
    }

    public String getEncodedInformation() {
        return this.secretCode;
    }
}
