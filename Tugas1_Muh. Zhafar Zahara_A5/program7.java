/*casting menggunakan kelas*/
class castinglagi{
	public static void main(String[]args){
		int a=4, b=6;
		float c=2.f, d=1.f;
		char g='5';
		double k=3.14;
		String n="65",m="45", l="100";
		/*untuk konversi tipe data karakter ke bilangan itu menggunakan parse*/
		a=Integer.parseInt(n); /*String ke int*/
		k=Double.parseDouble(m);/*String ke double*/
		c=Float.parseFloat(l); /*String ke float*/
		System.out.println("a="+a+"\nk="+k+"\nc="+c);
		/*untuk konversi tipe data integer ke String itu menggunakan valueOf*/
		n=String.valueOf(a); /*int ke String*/
		m=String.valueOf(g); /*karakter ke String*/
		l=String.valueOf(d); /*float ke String*/
		System.out.println("n="+a+"\nm="+m+"\nl="+l);
		/*untuk konversi bulat ke tipe data float dan double*/
		k=Double.valueOf(b).intValue(); /*int ke double*/
		c=Float.valueOf(a).intValue(); /*int ke float*/
		System.out.println("k="+k+"\nc="+c);
	}
}