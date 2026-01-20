package practice;

public class Main {

	public static void main(String[] args) {          

        Transaction[] trans = {new Income(0,"1월6일","시작"),new Transfer(10000,"0108","우유"),
        		new Expense(500,"0109","껌")};
        
        for(Transaction a : trans) {
        	a.showAmount();
        }
       
        
        
			
		
		
		
		
	}

}
