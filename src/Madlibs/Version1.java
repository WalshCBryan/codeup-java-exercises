package Madlibs;

public class Version1 extends fillThisIn{

    public Version1(String[] words){
        this.name = words[0];
        this.color = words[1];
        this.randomObject = words[2];
        this.location = words[3];
        }

    public String greeting(){
        return "'hello there!'";
    }

    public String goToLocation(){
        return "he went to the " + location;
    }

    public String pickUpObject(){
        return "he grabbed the " + randomObject;
    }
}
