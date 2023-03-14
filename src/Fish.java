import java.util.zip.ZipInputStream;

public class Fish {
    String breed;
    String wheredoesHeLive;
    String weight;
    public Fish (String breed, String wheredoesHeLive, String weight){
        this.breed = breed;
        this.wheredoesHeLive=wheredoesHeLive;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Fish" + "\n"+
                "breed: " + breed + "\n" +
                "wheredoesHeLive: " + wheredoesHeLive + "\n" +
                "weight: " + weight + "\n" ;
    }
}
