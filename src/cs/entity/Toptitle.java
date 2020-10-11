package cs.entity;

import java.util.Date;

public class Toptitle {
    private int topID;
    private String topTitle;
    private Date sendDate;
    private int userID;

    public int getTopID() {
        return topID;
    }

    public void setTopID(int topID) {
        this.topID = topID;
    }

    public String getTopTitle() {
        return topTitle;
    }

    public void setTopTitle(String topTitle) {
        this.topTitle = topTitle;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Toptitle{" +
                "topID=" + topID +
                ", topTitle='" + topTitle + '\'' +
                ", sendDate=" + sendDate +
                ", userID=" + userID +
                '}';
    }
}
