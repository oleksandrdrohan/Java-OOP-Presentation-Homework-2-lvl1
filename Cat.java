public class Cat extends Animal{
    private String name;

    public Cat(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getVoice() {
        return "Meow-Meow";
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating " + getRation());
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}' + super.toString();
    }
}
