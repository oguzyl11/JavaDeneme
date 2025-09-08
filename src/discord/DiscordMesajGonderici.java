package discord;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class DiscordMesajGonderici {
    void discordMesajiniGonder(Discord discord) throws IOException {
        URL url = new URL(discord.webhookUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json");

        // JSON verisini al
        byte[] out = discord.jsonAl().getBytes(StandardCharsets.UTF_8);

        // Gönder
        try (OutputStream stream = connection.getOutputStream()) {
            stream.write(out);
        }

        // Yanıt kontrolü
        int responseCode = connection.getResponseCode();
        System.out.println("Discord response code: " + responseCode);

        connection.disconnect();
        System.out.println("Gönderilen JSON: " + discord.jsonAl());
    }
}
