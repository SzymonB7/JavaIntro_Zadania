package babiarz.pl;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void writeWebsiteToFile (String url, String file) throws Exception{
        HttpClient client = HttpClient.newBuilder().build();

        HttpRequest request = HttpRequest.newBuilder(new URI(url))
                .GET()
                .build();

        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());

        String websiteHtml = httpResponse.body();

        Files.writeString(Path.of(file), websiteHtml);
    }
}
