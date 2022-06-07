package nl.hu.bep.battlesnake.model;

public class GameInfo {
    public String apiverion = "1";
    public String author = "MyUsername";
    public String color = "#888888";
    public String head = "default";
    public String tail = "default";
    public String version = "0.0.1-beta";

    private String getApiverion() {
        return apiverion;
    }

    private String getAuthor() {
        return author;
    }

    private String getColor() {
        return color;
    }

    private String getHead() {
        return head;
    }

    private String getTail() {
        return tail;
    }

    private String getVersion() {
        return version;
    }

    private void setApiverion(String apiverion) {
        this.apiverion = apiverion;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private void setColor(String color) {
        this.color = color;
    }

    private void setHead(String head) {
        this.head = head;
    }

    private void setTail(String tail) {
        this.tail = tail;
    }

    private void setVersion(String version) {
        this.version = version;
    }
}
