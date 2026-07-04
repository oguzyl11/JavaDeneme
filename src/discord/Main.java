package discord;

public class Main {
    public static void main(String[] args) {
        try {
            Discord discord = new Discord();
            discord.webhookUrl = "https://discordapp.com/api/webhooks/1413251317895401523/JPAgF1sHI-IT4GVYZ8OfJa75eN-btjqfosSZ4GtV1RO9g4u5fBpao2mAZYchxpq1Z-mk"; // kendi webhook’un
            discord.username = "Null";
            discord.content = "deneme mesajı";
            discord.avatar_url = "https://i.imgur.com/oBPXx0D.png";
          
            DiscordMesajGonderici discordMesajGonderici = new DiscordMesajGonderici();
            discordMesajGonderici.discordMesajiniGonder(discord);

            System.out.println("Mesaj gönderildi!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
