package com.example.android.friendlychat;

/**
 * Created by android on 12/5/2016.
 */
public class ChatMessages
{
    private String text;
    private String name;
    private String photoUrl;

    public ChatMessages() {}

    public ChatMessages(String text, String name, String photoUrl) {
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
    }

    public String getText() {
        return text;
    }

    public String getName() {
        return name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }
}
