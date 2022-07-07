package nl.hu.bep.battlesnake.model;

public class GameInfo {
    public String apiversion = "1";
    public String author = "Jayro Pattimaipau";
    public String color = "#0000FF";
    public String head = "replit-mark";
    public String tail = "rbc-necktie";
    public String version = "0.0.1-beta";

    private String getApiverion() {
        return apiversion;
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

    public void setApiverion(String apiverion) {
        this.apiversion = apiverion;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
