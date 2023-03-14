public class Parrot {
    String name;
    String cpolor;
    String whatCan;
    String weight;
    String age;
    public Parrot (String cpolor, String name, String weight, String whatCan, String age){
        this.name = name;
        this.cpolor = cpolor;
        this.weight=weight;
        this.whatCan = whatCan;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Parrot" +
                "name: " + name + "\n" +
                " cpolor: " + cpolor + "\n"+
                "whatCan: " + whatCan + "\n" +
                " weight: " + weight + "\n" +
                " age: " + age ;
    }
}
