package designPatterns.structural.adapter;

public class SecretCamera {

    private final String secretCode;

    public SecretCamera(String secretCode) {
        this.secretCode = secretCode;
    }

    public String getEncodedInformation() {
        return this.secretCode;
    }
}
