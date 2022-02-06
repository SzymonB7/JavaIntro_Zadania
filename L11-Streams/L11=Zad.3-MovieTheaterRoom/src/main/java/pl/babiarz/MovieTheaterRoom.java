package pl.babiarz;

public class MovieTheaterRoom {
    private final String name;
    private final String type;

    public MovieTheaterRoom(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
