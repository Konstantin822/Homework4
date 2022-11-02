package din;

public class main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Bobik", 510, 10);
        Animal dog2 = new Dog("Tod", 400, 10);
        Animal cat1 = new Cat("Barsik", 210);
        Animal cat2 = new Cat("Matros", 150);

        System.out.println("Amount of animals: " + Animal.amount);
    }

}
