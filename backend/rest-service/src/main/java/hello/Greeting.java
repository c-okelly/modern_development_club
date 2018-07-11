package hello;

public class Greeting {

    private final long id;
    private final String content;
    private final String name;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        this.name = "Greeter";
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }

}