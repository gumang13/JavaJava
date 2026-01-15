package animals;

import common.Animal;

public class Bird extends Animal{
      public Bird(String name) {
              super(name);    	  
      }
      public void sound() {
    	  System.out.println("["+name+"]이 짹짹거립니다");
      }
      
}
