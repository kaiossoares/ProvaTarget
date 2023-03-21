import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class questao5 {
    public static void main(String[] args) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        String caracter = "";
        boolean caracterValido = false;

        while (!caracterValido) {
            System.out.print("Informe uma String: ");
            caracter = teclado.readLine();

            caracterValido = true;
            for(char c : caracter.toCharArray()) {
                if(Character.isDigit(c)) {
                    caracterValido = false;
                    break;
                }
            }

            if(!caracterValido) System.out.println("Informe somente caracteres!");
        }

        StringBuilder builder = new StringBuilder();
        for (short i = (short) (caracter.length() -1); i >= 0; i--) {
            builder.append(caracter.charAt(i));
        }
        String caracterInvertido = builder.toString();

        System.out.println("String informada: " + caracter +
                           "\nString invertida: " + caracterInvertido);
    }
}
