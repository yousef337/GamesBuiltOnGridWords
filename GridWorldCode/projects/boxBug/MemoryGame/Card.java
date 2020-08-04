package MemoryGame;

public class Card {

    public String value;
    public boolean isHidden;

    public Card(String value){
        this.value = value;
        isHidden = true;
    }

    public void hide(){
        isHidden = true;
    }

    public void show(){
        isHidden = false;
    }

    public String toString() {
        return this.isHidden ? "?" : this.value;
    }
}
