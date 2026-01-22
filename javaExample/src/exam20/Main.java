package exam20;

public class Main {

	public static void main(String[] args) {
		RemoteControl tv = new RemoteControl() {
			@Override
			public void trunOn() {
				System.out.println("tv를 켭니다");
			}
			
		};
     tv.trunOn();
	}

}
