
public class PyramidB {

	public static void main(String[] args) {
int i, j;
		
		for (i=0; i<7; i++)  {  
			
			for(j=7 - i; j > 0;j--)  { 
				System.out.print(j + " ");	  
			}  
			for (j = 2;j<=7 - i;j++){
				System.out.print(j + " ");
			}  
			System.out.println();
		}

	}

}
