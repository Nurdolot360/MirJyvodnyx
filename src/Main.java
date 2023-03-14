import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik",2,"whiet","lezy");
        Dog dog = new Dog("zizi","bleyk","hard","no");
        Fish fish = new Fish("Farel","akvarim","1kg");
        Parrot parrot = new Parrot("blue", "jaes","5kg","da chto ugodno","4");
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(fish);
        System.out.println(parrot);
    }
}