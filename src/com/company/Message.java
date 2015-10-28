package com.company;

/**
 * Created by landonkail on 10/28/15.
 */
public class Message {
    int id;
    int replyId;
    String userName;
    String text;

    public Message(int id, int replyId, String userName, String text) {
        this.id = id;
        this.replyId = replyId;
        this.userName = userName;
        this.text = text;
    }
}
