package Classi;

public class Card {
    String text;
    String pathImage;

    public Card(String text, String pathImage) {
        this.text = text;
        this.pathImage = pathImage;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }
}
