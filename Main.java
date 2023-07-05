public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Fish", "Black", 4, "Marty");
        Dog dog = new Dog();
        dog.setColor("Yellow");
        dog.setRation("Meat");
        dog.setWeight(25);
        dog.setName("Ciri");
        String catVoice = cat.getVoice();
        System.out.println(catVoice);
        cat.sleep();
        cat.eat();
        dog.eat();
        dog.sleep();
        String dogVoice = dog.getVoice();
        System.out.println(dogVoice);
        Veterinarian vet = new Veterinarian("Oleksandr");
        vet.treatment(cat);
        vet.treatment(dog);
    }
}
