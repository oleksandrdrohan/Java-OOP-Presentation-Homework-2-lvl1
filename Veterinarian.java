public class Veterinarian {
    private String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    public Veterinarian() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void treatment(Animal animal){
        System.out.println("I am " + getName() + " and i healing you " + animal.toString());
    }
}
