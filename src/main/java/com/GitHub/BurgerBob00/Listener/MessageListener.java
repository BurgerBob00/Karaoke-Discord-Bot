package com.GitHub.BurgerBob00.Listener;
import net.dv8tion.jda.api.events.message.priv.PrivateMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.io.File;

public class MessageListener extends ListenerAdapter {
    @Override
    public void onPrivateMessageReceived(PrivateMessageReceivedEvent event){
        if(event.getAuthor().isBot()) return;
        String text = event.getMessage().getContentRaw();
        event.getAuthor().openPrivateChannel().flatMap(channel -> channel.sendMessage(text)).queue();
        System.out.println(text);
        /*if(event.getMessage().getContentRaw().equalsIgnoreCase("MUSICS")){
            File reverend = new File("./src/main/resources/videos/Reverendburn.mp4");
            event.getAuthor().openPrivateChannel().flatMap(channel -> channel.sendMessage("ciock")).queue();
            event.getAuthor().openPrivateChannel().flatMap(channel -> channel.sendFile(reverend)).queue();
        }*/

    }
}