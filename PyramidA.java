public class PyramidA {

	public static void main(String[] args) {
int i, j;
		
		for (i=0; i<7; i++)  {  
			
			for(j=0; j < i;j++)  { 
				System.out.print(" ");	  
			}  
			for (int k = 0;k<7 - i;k++){
				System.out.print("*");
			}  
			System.out.println();
		}

	}

}
