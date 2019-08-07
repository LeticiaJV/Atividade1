package projeto1_tabuada;

import java.util.Scanner;

public class Projeto1_Tabuada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	int numero;
        char opcao;
	do
	{
	    try
	    {
                System.out.println("Selecione um número para que sua tabuada seja exibida: \n");
    	        numero = entrada.nextInt();
    		for (int n = 1; n <= 10; n++)
    		{
    		    System.out.println(n + " x " + numero + " = " + (n * numero));
    		}
    		System.out.println("Resultado obtido. Deseja informar outro número <S/N>?\n");
    		opcao = entrada.next().charAt(0);               
	    }
	    catch (Exception erro)
            {                
	        System.out.println("Entrada incorreta.\n");
                return;
	    }
	}
	while (opcao == 'S' || opcao == 's');
    }   
}
