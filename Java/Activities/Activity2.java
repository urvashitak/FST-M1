
public class Activity2 {
	 public static void main(String[] args) {
		 int Numbers[]= {10, 77, 10, 54, -11, 10};
		 int i;
		 int total=0;
		 for(i=0;i<=5;i++) {
			 if(Numbers[i]==10)
				 total=total+Numbers[i];}
		
		if(total==30)
			 System.out.println("Total " + total);
		else
			 System.out.println("false");
	 }

}