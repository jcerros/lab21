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
