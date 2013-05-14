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
