package pl.babiarz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        MovieTheaterRoom room1 = new MovieTheaterRoom("Room 1", Type.D2);
        MovieTheaterRoom room2 = new MovieTheaterRoom("Room 2", Type.D2);
        MovieTheaterRoom room3 = new MovieTheaterRoom("Room 3", Type.D2);
        MovieTheaterRoom room4 = new MovieTheaterRoom("Room 4", Type.D2);
        MovieTheaterRoom room5 = new MovieTheaterRoom("Room 5", Type.D2);
        MovieTheaterRoom room6 = new MovieTheaterRoom("Room 6", Type.D3);
        MovieTheaterRoom room7 = new MovieTheaterRoom("Room 7", Type.D3);
        MovieTheaterRoom room8 = new MovieTheaterRoom("Room 8", Type.D3);
        MovieTheaterRoom room9 = new MovieTheaterRoom("Room 9", Type.D2);
        MovieTheaterRoom room10 = new MovieTheaterRoom("Room 10", Type.D4);

        List<MovieTheaterRoom> rooms = new ArrayList<>(Arrays.asList(room1, room2, room3, room4, room5, room6, room7, room8, room9, room10));

        System.out.println(rooms
                .stream()
                .collect(Collectors.groupingBy(MovieTheaterRoom::getType,Collectors.counting())));
    }
}
