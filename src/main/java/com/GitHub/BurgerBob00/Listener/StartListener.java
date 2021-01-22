package com.GitHub.BurgerBob00.Listener;

import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.net.URL;
import java.util.ArrayList;

public class StartListener extends ListenerAdapter {
    @Override
    public void onReady(ReadyEvent event) {
        ArrayList<String> messages = new ArrayList<>();
        event.getJDA().getGuildById("491655177250799619").getTextChannelById("797248007300841552").getIterableHistory()
                .stream().filter(m -> isURL(m.getContentRaw())).forEach(m -> messages.add(m.getContentRaw()));
        System.out.println(messages);
    }

    public static boolean isURL(String url) {
        try {
            new URL(url);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
