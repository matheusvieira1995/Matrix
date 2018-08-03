package Randomizer;

public class MiddleSquareRandomizer implements Randomizer {
	private long semente = 1;
	private long quadrado;
	@Override
	public double random() {
		this.quadrado = this.semente * this.semente;
		double meio = quadrado % 1000000 / 100;
		double r = meio / 10000;
		this.semente++;
		return r;
	}

	@Override
	public int randomInt(int max) {
		return (int)(random() * max + 1);
	}

	@Override
	public int randomInt(int min, int max) {
		return (int)(randomInt(max + 1 - min)) + min - 1;
	}

}
