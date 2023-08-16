package day20.GPT;

public class HelloWorld {
    private String message;

    public HelloWorld() {
        this.message = "Hello Java";
    }

    public void printMessage() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.printMessage();
    }
}
