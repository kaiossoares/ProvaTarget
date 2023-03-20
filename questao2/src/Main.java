import java.io.*;
public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        short valor = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Informe um número inteiro: ");
                valor = Short.parseShort(teclado.readLine());
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Informe um número inteiro menor ou igual a 32767.");
            }
        }

        while (valor < 0) {
            System.err.print("Informe apenas números inteiros! Tente novamente: ");
            valor = Short.parseShort(teclado.readLine());
        }

        boolean pertenceFibonacci = false;
        int a = 0, b = 1;

        while (b <= valor) {
            if (valor == b) {
                pertenceFibonacci = true;
                break;
            }
            int aux = a + b;
            a = b;
            b = aux;
        }

        if(pertenceFibonacci) {
            System.out.println(valor + " pertence a sequência de fibonacci.");
        } else {
            System.out.println(valor + " não pertence a sequência de fibonacci.");
        }

    }
}