package sangsog;


import animals.Bird;
import animals.Cat;
import animals.Dog;
import animals.Rabbit;
import common.Animal;

public class Main2 {

	public static void main(String[] args) {
	  Animal[] animals = {new Dog("바둑이","시고르자브종"),new Cat("나비"),
			  new Rabbit("하양이"),new Bird("짹잭이")};
	  
	  for(Animal a : animals) {
		  a.sound();
		  a.sleep();
		  if(a instanceof Dog)
			  ((Dog)a).getBreed();
		  System.out.println();
	  }
	  ((Dog)animals[0]).getBreed();
	  
	  
	  
	}
}
// bird 클래스 짺짹소리