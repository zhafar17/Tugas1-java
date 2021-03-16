class tugas16 { 
 
	/**  
	* @param args 
	*/ 
	public static void main(String[] args) { 
		// TODO Auto-generated method stub   /* Kamus */ 
 
		boolean Bool1, Bool2, TF ;
		int i,j, hsl ;  
		float x,y,res;   
		/* algoritma */    
		System.out.println  ("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output"); 
 
			Bool1 = true; Bool2 = false;     
			TF = Bool1 && Bool2 ; /* Boolean AND */
				System.out.println("hasil="+TF);
			TF = Bool1 || Bool2 ; /* Boolean OR */ 
				System.out.println("hasil="+TF);
			TF = ! Bool1 ;  /* NOT */ 
				System.out.println("hasil="+TF);
			TF = Bool1  ^Bool2;  /* XOR */  
				System.out.println("hasil="+TF);
			/* operasi numerik */    
				System.out.println("Operasi numerik variabel yang bertipe data integer");
			i = 5; j = 2 ;     
			hsl = i+j; 
				System.out.println("hasil="+hsl);
			hsl = i - j; 
				System.out.println("hasil="+hsl);
			hsl = i / j; 
				System.out.println("hasil="+hsl);
			hsl = i * j;   
				System.out.println("hasil="+hsl);
			/* pembagian bulat */ 
			System.out.println("Pembagian bilangan bulat dan sisa baginya");
			hsl = i /j ;    
				System.out.println("hasil="+hsl);
			hsl = i%j ; /* sisa. modulo */ 
				System.out.println("sisa="+hsl);
			/* operasi numerik */ 
				System.out.println("Operasi Numerik variabel x dan y yang bertipe data float");
			x = 5 ; y = 5 ;       
			res = x + y; 
				System.out.println("hasil penjumlahan="+res);
			res = x - y; 
				System.out.println("Hasil pengurangan="+res);
			res = x / y;
				System.out.println("Hasil pembagian="+res);
			res = x * y; 
				System.out.println("hasil perkalian="+res);
			/* operasi relasional numerik */  
				System.out.println("Operasi relasional numerik dengan mengunakan variabel i dan j yang bertipe data integer");
			TF = (i==j); 
				System.out.println("hasil="+TF);
			TF = (i!=j);  
				System.out.println("hasil="+TF);
			TF = (i < j);
				System.out.println("hasil="+TF);
			TF = (i > j); 
				System.out.println("hasil="+TF);
			TF = (i <= j);
				System.out.println("hasil="+TF);
			TF = (i >= j); 
				System.out.println("hasil="+TF);
			/* operasi relasional numerik */  
			System.out.println("Operasi relasional numerik dengan mengunakan variabel x dan y yang bertipe data float");
			TF = (x != y);    
				System.out.println("hasil="+TF);
			TF = (x < y); 
				System.out.println("hasil="+TF);
			TF = (x > y);
				System.out.println("hasil="+TF);
			TF = (x <= y);
				System.out.println("hasil="+TF);
			TF = (x >= y); 
				System.out.println("hasil="+TF);
 
	} 
 
} 