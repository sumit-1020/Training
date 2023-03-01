package Assignments;
public class AlphabetCalculator {

	public static void main(String[] args) {
	
		String s = "Hello Mummy";
		//s = s.replaceAll("\\s", "");
		//System.out.println(s);
		String[] word = s.split(" ");
		
		int r = 0, l = 0;		 // r is right side comparator and l is left side one
		for ( r =0; r < s.length(); r++){
			l++;
			int count = 0;	
			for (int m = 0; m < s.length(); m++) {  	// m is for general count of loop

				if(((String)word[r] !=(String)word[l])) {
					l++;
					count++;
					continue;	
				}
				else {
					l++;
					count++;			
					continue;
				}				
			}
			System.out.println((String)word[r] + ":	" + count);
		}
				
	}
}
