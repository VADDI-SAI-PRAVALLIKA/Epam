package creational2;
import static org.junit.Assert.*;

import org.junit.Test;

public class test {
	
	@Test
	public void testMain() 
	{
		Main m=new Main();
		
		Animal2 a=new Animal2();
		assertEquals(null,a.getAnimal("dgsfg"));
		Dog d=new Dog();
		assertEquals("Dog is eating, woof!",d.eat());
		Animal animal = a.getAnimal("dOg");
		assertEquals("Dog is eating, woof!",animal.eat());
		Animal animal2 = a.getAnimal("CAT");
        assertEquals("Cat is eating, meow!",animal2.eat());;
        Animal animal3 = a.getAnimal("raBbIt");
        assertEquals("Rabbit is eating, squeak!",animal3.eat());
	}

}
