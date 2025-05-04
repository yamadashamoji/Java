class Sample2_06_2 {
	public static void main (String[] args) {
		
		double bottom = 3.0 ;
		double height = 7.0 ;
		
		Sample2_06_2 xxx = new Sample2_06_2();
		
		System.out.println( "三角形の面積：" + xxx.calcSizeTriangle( bottom, height ) );
	}
	
	
	double calcSizeTriangle(double bt, double ht){
		return bt * ht / 2 ;
	}
}

