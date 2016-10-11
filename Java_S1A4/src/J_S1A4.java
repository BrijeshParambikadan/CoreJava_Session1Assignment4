/* program to print the characters corresponding to ASCII codes from 65 to 90 */

public class J_S1A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ASCII codes from 65 to 90 is as follows : ");
		
		for ( int i = 65; i <= 90; ++i ){
            char a = (char)i;
            int b = (int) a;// your work is done here
            System.out.println(b+"-" + a );
            }
	}

}
