package pl.babiarz;

public class MovieTheaterRoom {
    private final String name;
    private final Type type;

    public MovieTheaterRoom(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type.value;
    }
}
