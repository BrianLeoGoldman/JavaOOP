package designPatterns.behavioral.strategy.display;

public class GraphicDisplayingBehaviour implements DisplayingBehaviour {
    @Override
    public void display(String name, int id) {
        String image = "///-\\\\\\\n" +
                "|^   ^|\n" +
                "|O   O|\n" +
                "|  ~  |\n" +
                " \\ O /\n" +
                "  | |";
        System.out.println(image + "\n" + name + " - " + id);
    }
}
