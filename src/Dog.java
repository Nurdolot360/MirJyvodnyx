public class Dog {
    String name;
    String color;
    String bites;
    String drawn;
    public Dog (String name , String color , String bites, String drawn){
        this.name = name;
        this.color = color;
        this.bites = bites;
        this.drawn = drawn;
    }
    @Override
    public String toString() {
        return "Dog " +"\n"+
                "name: " + name + "\n" +
                "color: " + color + "\n" +
                "bites: " + bites + "\n" +
                " drawn: " + drawn + "\n";
    }
}
