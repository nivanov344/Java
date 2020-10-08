package school;

import java.util.Random;

public class PlayingCards {

	public static void main(String[] args) {
		
		int[] picked = new int[10];
		int index = 0;
		int color = 0;
		int card = 0;
		boolean isUnq = true;
		Random rand = new Random();
		
		
		for (int j = 0; j<4 ; j++) {
			index = rand.nextInt(13);
			color = rand.nextInt(4);
			card = color*100 + index;
			isUnq = true;
			for (int k = 0; k<j; k++) {
				
				if (card == picked[k]) {
					isUnq = false;
				}
				if (isUnq) {
					picked [j] = card;
				}else {
					j--;
				}
			}
			
		}
		for (int m = 0;m<4;m++) {
			int realColor = picked[m]/100;
			int realCard = picked[m]%100;
			switch(realCard) {
			case 0:
				System.out.print("A of ");
				break;
			case 1:
				System.out.print("2 of ");
				break;
			case 2:
				System.out.print("3 of ");
				break;
			case 3:
				System.out.print("4 of ");
				break;
			case 4:
				System.out.print("5 of ");
				break;
			case 5:
				System.out.print("6 of ");
				break;
			case 6:
				System.out.print("7 of ");
				break;
			case 7:
				System.out.print("8 of ");
				break;
			case 8:
				System.out.print("9 of ");
				break;
			case 9:
				System.out.print("10 of ");
				break;
			case 10:
				System.out.print("J of ");
				break;
			case 11:
				System.out.print("Q of ");
				break;
			case 12:
				System.out.print("K of ");
				break;
			}
			switch (realColor) {
			case 0:
				System.out.println("clubs");
				break;
			case 1:
				System.out.println("diamonds");
				break;
			case 2:
				System.out.println("hearts");
				break;
			case 3:
				System.out.println("spades");
				break;
			}
		}
		
		
	}

}
