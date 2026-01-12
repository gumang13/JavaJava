package std20260112;

public class Method1 {

	public static void main(String[] args) {
		
		Board board = new Board("점심메뉴는?","박문수",45);
		System.out.println(board);
		
		board.hitUp("박문수");
          board.hitUp("철수");
          System.out.println(board);
          board.updateTitle("박문슈","못말려");
        
          System.out.println(board);
          board.updateTitle("박문수","짱구는못말려");
          System.out.println(board);
	}

}
