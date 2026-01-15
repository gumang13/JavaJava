package common;

public abstract class Animal {
        protected String name;
        
        public Animal(String name) {
        	this.name = name;
        }
        
        public final void sleep() {
        	System.out.println("["+name+"]이 새근새근 잠을 잡니다");
        }
        
     // 자식 클래스가 구현해야 하는 규칙
     public abstract void sound();

 



}
