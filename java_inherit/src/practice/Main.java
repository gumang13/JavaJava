package practice;

public class Main {

	public static void main(String[] args) {          

        Transaction trans = new Income(0,"1월6일","시작");
        trans.showAmount();
        trans.income(100000,"1월5일","훈련수당");
        trans.showAmount();
        trans.expence(10000,"1월6일","파미향");	
        trans.showAmount();
        trans.expence(1000, "null", "null");
        trans.showAmount();
        
        
			
		
		
		
		
	}

}
