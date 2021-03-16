import java.util.Scanner;
class ekspresi{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		int x=1,y=2;
		float fx, fy;
		
		System.out.println("Pembagian integer="+x/y);
		System.out.println("Pembagian float="+x/y);
		//Supaya hasilnya tidak nol maka kita buatkan persamaan seperti dibawah ini
		fx=x;
		fy=y;
		System.out.println("Pembagian integer="+fx/fy);
		System.out.println("Pembagian float="+fx/fy);
		//casting
		System.out.println("Format integer="+(float)x/(float)y);
		System.out.println("Format float="+(float)x/(float)y);
		
		x=10;
		y=3;
		System.out.println("Format integer="+x/y);
		System.out.println("Format float="+x/y);
		
	}
}