package designPatterns.structural.adapter;

public class Spy {

    private String codename;
    private String country;


    public Spy(String codename, String country) {
        this.codename = codename;
        this.country = country;
    }

    public void obtainInformation(SecretDecoder decoder) {
        String decodedInformation = decoder.decode();
        System.out.println("The code is: " + decodedInformation);
    }
}
