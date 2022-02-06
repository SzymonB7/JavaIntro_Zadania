package pl.babiarz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> doctors = Arrays.asList("Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra", "Przychodnia:Pediatra", "Przychodnia:Internista:Laryngolog:Pediatra");

        List<String> specializations = doctors
                .stream()
                .map(specialization -> specialization.split(":"))
                .flatMap(Arrays::stream)
                .distinct()
                .filter(specialization -> !specialization.equals("Przychodnia") && !specialization.equals("Szpital"))
                .collect(Collectors.toList());

        System.out.println(specializations);

    }




}
