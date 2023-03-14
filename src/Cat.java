import java.lang.invoke.StringConcatException;

public class Cat {
    String name;
    int age;
    String color;
    String character;
    public Cat (String name, int age, String color, String character){
        this.name = name;
        this.age = age;
        this.color = color;
        this.character = character;
    }
    @Override
    public String toString() {
        return "Cat" + "\n"+
                "name: " + name + "\n" +
                " age: " + age +"\n"+
                " color: " + color + "\n" +
                "character: " + character + "\n";
    }
}
