package cs.entity;

import java.util.Date;

public class News {
    private int newID;
    private String newTitle;
    private String newsContent;
    private Date sendDate;
    private int userID;
    private int topID;

    public int getNewID() {
        return newID;
    }

    public void setNewID(int newID) {
        this.newID = newID;
    }

    public String getNewTitle() {
        return newTitle;
    }

    public void setNewTitle(String newTitle) {
        this.newTitle = newTitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
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

    public int getTopID() {
        return topID;
    }

    public void setTopID(int topID) {
        this.topID = topID;
    }

    @Override
    public String toString() {
        return "News{" +
                "newID=" + newID +
                ", newTitle='" + newTitle + '\'' +
                ", newsContent='" + newsContent + '\'' +
                ", sendDate=" + sendDate +
                ", userID=" + userID +
                ", topID=" + topID +
                '}';
    }
}
