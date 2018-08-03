package Randomizer;

public class Main {

	public static void main(String[] args) {
		// como o teste nï¿½o ï¿½ preciso, precisamos gerar 1 milhï¿½o de vezes
		// e checar se os nï¿½meros gerados estï¿½o no intervalo:
		System.out.println("Testando intervalo ...");
		Randomizer r = new MiddleSquareRandomizer();
		for (int i = 0; i < 1000000; i++) {
		    double n = r.random();
		    if (n < 0 || n >= 1.0) System.out.println("false: " + n);
		}
		 
		System.out.println("Testando variação ...");
		Randomizer r2 = new MiddleSquareRandomizer();
		int[] variacao = new int[10];
		for (int i = 0; i < 1000000; i++) {
		    variacao[((int) (r2.random() * 10))]++;
		}
		// deve ter +ou- 100000 em cada slot:
		System.out.println(java.util.Arrays.toString(variacao));
		// 0.4 atï¿½ aqui
		
		System.out.println("Testando randomInt ...");
		Randomizer r3 = new MiddleSquareRandomizer();
		for (int i = 0; i < 1000000; i++) {
		    int n = r3.randomInt(17);
		    if (n < 0 || n > 17) System.out.println("false: " + n); 
		}
		System.out.println("Foi");
		
		
		// 0.5 atï¿½ aqui
		for (int i = 0; i < 1000000; i++) {
		    int n = r3.randomInt(17, 51);
		    if (n < 17 || n > 51) System.out.println("false: " + n);
		}
		// 0.6 atï¿½ aqui
		System.out.println("Foi");
		
	}

}
