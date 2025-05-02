class Sample1_14_4 {
	
	public static void main(String[] args) {
		
		//ローカル変数のしくみ
		
		String message = "不正です" ;
		
		if( args.length == 2 ){
			
			int num1 = Integer.parseInt( args[0] );
			int num2 = Integer.parseInt( args[1] );
			
			int print = sum( num1 + num2 );
			
		}else{
			System.out.println( message );
		}
		
		System.out.println("print:" + print );
	}
	
	static int sum(int num1 , int num2 ) {
		
		int calcResult = num1 + num2 ;
		
		return calcResult ;
		
	}
	
}

