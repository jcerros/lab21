lab21
=====
public class Testprogram {

  public static void main(String args[]) {
		// static roll
			System.out.println(Dice.Roll_1_Dice());
			System.out.println(Dice.RollDice(2, 6));

		// public roll
		Dice Object = new Dice();
		System.out.println(Object.RollDice());
		System.out.println(Object.RollDice());
		System.out.println(Object.RollDice());
		System.out.println(Object.RollDice());
		System.out.println(Object.RollDice());
		System.out.println(Object.RollDice());
		System.out.println(Object.RollDice());
		System.out.println(Object.RollDice());
		System.out.println(Object.RollDice());
		System.out.println(Object.RollDice());


		// dice roll counter displayed
		System.out.println("static dice count is\t" + Dice.RollCount());
		System.out.println("public dice count is\t" + Object.RollCount2());

		// implemented class triple dice and testing program
		TripleDice nobject = new TripleDice(3, 6);
		System.out.println("override and the triple dice value is\t"
				+ nobject.RollDice());
		System.out.println("triple dice count is\t" + nobject.RollCount3());

		System.out.println("This causes program to reset triple dice rolled\t"
				+ nobject.reset());

	
		for (int i :Object.RollHistoryArray()){
			System.out.println(i);
		}
	}
	

}



public class TripleDice extends Dice {
  int numero, cara;
	int qtotal;

	public TripleDice(int dinum, int six) {
		numero = dinum;
		cara = six;
	}

	@Override
	public int RollDice() {
		qtotal += numero;
		return (numero + (int) (Math.random() * cara * numero));
	}

	public int RollCount3() {
		return qtotal;

	}

	public int reset() {

		qtotal = 0;

		return qtotal;

	}
}




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
