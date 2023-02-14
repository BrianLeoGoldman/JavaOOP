package designPatterns.structural.adapter;

public class CameraDecoder implements Decoder {

    private int code;
    private Camera camera;

    public CameraDecoder(int code, Camera camera) {
        this.code = code;
        this.camera = camera;
    }

    @Override
    public String decode() {
        String encodedInformation = this.camera.getEncodedInformation();
        StringBuilder decodedInformation = new StringBuilder("Camera number " + this.code + ": [");
        String[] arr = encodedInformation.split("");
        for (String ch: arr) {
            switch (ch) {
                case "a":
                    decodedInformation.append("z");
                case "b":
                    decodedInformation.append("y");
                case "c":
                    decodedInformation.append("x");
                default:
                    decodedInformation.append(".");
            }
        }
        return decodedInformation.append("]").toString();
    }
}