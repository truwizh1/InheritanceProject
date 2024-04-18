public class Mammal extends Animal implements AnimalBehavior, AnimalMove {
    public Mammal() {
        super();
    }

    public Mammal(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats as a mammal.");
    }

    @Override
    public String getVoice() {
        return "Mammal voice";
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps in a cozy place.");
    }

    @Override
    public String move() {
        return "moves on land";
    }
}
