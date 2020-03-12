package utils;

import java.util.Random;


public class Utils {
	/**
	 * O metodo deve receber dois inteiros que representam o inicio e o fim de um
	 * intervalo e retornar umnumero aleatorio que se encontra dentro do intervalo
	 * estabelecido, ou seja, [inicio, fim].Caso o inicio do intervalo ou o fim do
	 * intervalo sejam menor que zero, o metodo deve retornar -1. Ometodo tambem
	 * retorna -1 quando o inteiro representando o inicio do intervalo for maior ou
	 * igual aointeiro representando o fim do intervalo.
	 **/
    public int gerarNumeroAleatorio(int inicio, int fim) {
        if (inicio < 0 || fim < 0) {
            return -1;
        }
        
        if (inicio >= fim) {
            return -1;
        }
        
        int diff = fim - inicio + 1;
        Random random = new Random();
        
        int tInt = random.nextInt(diff); //esse m�todo retorna um n�mero aleatorio 
        								//entre 0 e diff [ 0, diff [
        return inicio + tInt;
    }

    /**
     * O metodo recebe como entrada um inteiro positivo no intervalo entre 1 e 20,
     * uma cadeia de caracteresdesse comprimento, e um caracter.Caso o comprimento
     * seja invalido ou o tamanho da cadeia n�o seja igual ao tamanho passado
     * comoparametro, retornar uma mensagem de erro. Se todos os dados forem
     * v�lidos, o metodo deve retornar a posi��o na cadeia em que o caracter
     * �encontrado pela primeira vez ou uma mensagem indicando que o caracter n�o
     * est� presente na cadeia.
     **/
	public String acharCaracter(int tamanho, char cadeia[], char caracterProcurado) {
		if (tamanho < 1 || tamanho > 20)
			return "comprimento invalido";

		if (cadeia.length != tamanho)
			return "comprimento fornecido diferente do comprimento real";

		for (int i = 0; i < cadeia.length; i++) {
			caracterProcurado = cadeia[i];
			if (caracterProcurado == cadeia[i])
				return String.valueOf(i);
		}

		return "caracter nao encontrado";
	}	
}
