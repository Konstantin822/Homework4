package din;

public class Cat extends Animal{

    public Cat(String animal, int runningDistance) {
        this.animal = animal;
        if (runningDistance <= 200) {
            this.runningDistance = runningDistance;
            System.out.println("Cat " + this.animal + " ran " + this.runningDistance + " m");
        } else {
            System.out.println("Error. Write a number no greater than 200 m.");
        }
    }
}
