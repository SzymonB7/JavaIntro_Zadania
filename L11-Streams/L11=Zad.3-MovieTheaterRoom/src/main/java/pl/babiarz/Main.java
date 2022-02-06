package pl.babiarz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MovieTheaterRoom room1 = new MovieTheaterRoom("Room 1", "2D");
        MovieTheaterRoom room2 = new MovieTheaterRoom("Room 2", "2D");
        MovieTheaterRoom room3 = new MovieTheaterRoom("Room 3", "2D");
        MovieTheaterRoom room4 = new MovieTheaterRoom("Room 4", "2D");
        MovieTheaterRoom room5 = new MovieTheaterRoom("Room 5", "2D");
        MovieTheaterRoom room6 = new MovieTheaterRoom("Room 6", "3D");
        MovieTheaterRoom room7 = new MovieTheaterRoom("Room 7", "3D");
        MovieTheaterRoom room8 = new MovieTheaterRoom("Room 8", "3D");
        MovieTheaterRoom room9 = new MovieTheaterRoom("Room 9", "2D");
        MovieTheaterRoom room10 = new MovieTheaterRoom("Room 10", "4D");

        List<MovieTheaterRoom> rooms = new ArrayList<>(Arrays.asList(room1, room2, room3, room4, room5, room6, room7, room8, room9, room10));
        long rooms2D = rooms
            .stream()
            .map(MovieTheaterRoom::getType)
            .filter(room -> room.equals("2D"))
            .count();

        System.out.println(rooms2D);

        long rooms3D = rooms
                .stream()
                .map(MovieTheaterRoom::getType)
                .filter(room -> room.equals("3D"))
                .count();

        System.out.println(rooms3D);

        long rooms4D = rooms
                .stream()
                .map(MovieTheaterRoom::getType)
                .filter(room -> room.equals("4D"))
                .count();

        System.out.println(rooms4D);
    }
}
