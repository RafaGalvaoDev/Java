package desafio;

import java.security.InvalidParameterException;

public class Contadores {

	public void contar(int parametroOne, int parametroTwo) throws InvalidParameterException {

		int contagem = parametroTwo - parametroOne;
		if(parametroOne > parametroTwo) {
			throw new InvalidParameterException("O segundo parametro deve ser Maior do o primeiro");
		}else {

			for(int i = 0; i < contagem; i++) {
				System.out.println("Imprimendo o número: " + (i+1));
			}
		
		}

	}
}
