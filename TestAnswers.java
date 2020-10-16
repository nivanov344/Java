package school;

public class TestAnswers {

	public static void main(String[] args) {
		
		int[] results = new int[10];
	    char[] answers = new char[10];
	    
	    for (int i=0;i<10;++i) {
	      answers[i] = (char)(new java.util.Random().nextInt(5) + 65);
	    }
	    
	    for (int i=0;i<8;++i) {

	      for (int j=0;j<10;++j) {
	        
	        if (answers[i] == (char)(new java.util.Random().nextInt(5) + 65))
	          results[i] += 1;

	      }

	    }

	    for (int i : results)
	      System.out.println(i);

	}

}
