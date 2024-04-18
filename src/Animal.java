public abstract class Animal {
    String name;
    int age;
    double weight;

    public Animal() {
        this.name = "Unknown";
        this.age = 0;
        this.weight = 0.0;
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract void eat();
    public abstract String getVoice();

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight;
    }
}
