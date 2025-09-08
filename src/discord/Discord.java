package discord;

public class Discord {
    String webhookUrl;
    String username;
    String content;
    String avatar_url;

    String jsonAl() {
        return "{"
                + "\"username\":\"" + username + "\","
                + "\"avatar_url\":\"" + avatar_url + "\","
                + "\"content\":\"" + content + "\""
                + "}";
        
    }
}
