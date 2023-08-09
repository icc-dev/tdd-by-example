package guru.springframework;

public class Greeting {
    private static final String HELLO = "Hello";
    private static final String WORLD = "World";
    public String helloWorld() { return HELLO.concat(" ").concat(WORLD); }
    public String helloSomething(String word) { return HELLO.concat(" ").concat(word); }
}
