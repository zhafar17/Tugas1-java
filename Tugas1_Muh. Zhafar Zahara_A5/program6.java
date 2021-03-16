class casting{
	public static void main(String[]args){
		int a=4,b=7;
		float c=5.f,d=6.3f;
		char g='h';
		double k=3.14;
		
		System.out.println((float)a); //int ke float//
		System.out.println((double)b);//int ke double//
		System.out.println((int)c); /*float ke int*/
		System.out.println((double)d); /*float ke double*/
		System.out.println((int)g); /*char ke int*/
		System.out.println((float)g);/*char ke float*/
		System.out.println((double)g);/* char ke double*/
		System.out.println((int)k); /*double ke int*/
		System.out.println((float)k); /*double ke float*/
	}
}