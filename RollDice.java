public class Dice {
  static int total = 0;
	int ptotal = 0;
	int apple[]=new int[10];
	int x=0;

static int RollDice(int NumOfDice, int sidesofdice) {
		total += NumOfDice;

		// number of dices

		return (1 * NumOfDice + (int) (Math.random() * sidesofdice * NumOfDice));
	}

	public int RollDice() {
		ptotal++;
		
		apple[x]= (1 + (int) (Math.random() * 6));
		return apple[x++];
	}

	static int Roll_1_Dice() {
		total++;
		
		return 1 + (int) (Math.random() * 6);

	}

	static int RollCount() {

		return total;
	}

	public int RollCount2() {
		return ptotal;


	}public int[] RollHistoryArray(){
		return apple;
	}
}
