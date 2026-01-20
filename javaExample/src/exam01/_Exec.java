package exam01;

import java.util.Scanner;

public class _Exec {
      public static void main(String[] args) {
    	  String strs="";
         Scanner kbd = new Scanner(System.in);
         System.out.print("이름 :");
           String name = kbd.nextLine();
           System.out.print("주민번호 :");                        
           String ssn= kbd.nextLine();
           System.out.print("나이 :");
           String age= kbd.nextLine();
            
           strs = strs+"/"+name+","+ssn+","+age;
           System.out.println(strs);
}
}
