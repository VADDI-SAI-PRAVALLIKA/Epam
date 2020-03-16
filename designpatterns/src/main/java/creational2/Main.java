package creational2;

public class Main {

	public static void main(String[] args) {
        Animal2 animalFactory = new Animal2();
      
        Animal animal = animalFactory.getAnimal("dOg");
        animal.eat();
      
        Animal animal2 = animalFactory.getAnimal("CAT");
        animal2.eat();
      
        Animal animal3 = animalFactory.getAnimal("raBbIt");
        animal3.eat();
    }
}
