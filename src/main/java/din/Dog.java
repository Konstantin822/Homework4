package din;

public class Dog extends Animal {
    public Dog(String animal, int runningDistance, int swimmingDistance) {
        this.animal = animal;
        if (runningDistance <= 500) {
            this.runningDistance = runningDistance;
            System.out.println("Dog " + this.animal + " ran " + this.runningDistance + " m");
        } else {
            System.out.println("Error. Write a number no greater than 500 m.");
        }
        if (swimmingDistance <= 10) {
            this.swimmingDistance = swimmingDistance;
            System.out.println("Dog " + this.animal + " swam " + this.swimmingDistance + " m");
        } else {
            System.out.println("Error. Write a number no greater than 10 m.");
        }
    }
}
