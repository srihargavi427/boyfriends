package com.lnt.boyfriends.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class BoyFriendsList {

    private int boyFriendId;
    private String boyFriendName;
    private String boyFriendPlace;
    private String boyFriendClg;
    private int boyFriendPhno;


    public int getBoyFriendId() {
        return boyFriendId;
    }

    public void setBoyFriendId(int boyFriendId) {
        this.boyFriendId = boyFriendId;
    }

    public String getBoyFriendName() {
        return boyFriendName;
    }

    public void setBoyFriendName(String boyFriendName) {
        this.boyFriendName = boyFriendName;
    }

    public String getBoyFriendPlace() {
        return boyFriendPlace;
    }

    public void setBoyFriendPlace(String boyFriendPlace) {
        this.boyFriendPlace = boyFriendPlace;
    }

    public String getBoyFriendClg() {
        return boyFriendClg;
    }

    public void setBoyFriendClg(String boyFriendClg) {
        this.boyFriendClg = boyFriendClg;
    }

    public int getBoyFriendPhno() {
        return boyFriendPhno;
    }

    public void setBoyFriendPhno(int boyFriendPhno) {
        this.boyFriendPhno = boyFriendPhno;
    }
}
