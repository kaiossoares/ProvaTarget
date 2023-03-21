import java.util.HashMap;
import java.util.Map;

public class questao4 {
    public static void main(String[] args) {
        Map<String, Double> valoresEstados = new HashMap<>();
        valoresEstados.put("SP", 67836.43);
        valoresEstados.put("RJ", 36678.66);
        valoresEstados.put("MG", 29229.88);
        valoresEstados.put("ES", 27165.48);
        valoresEstados.put("outros", 19849.53);

        double valorTotal = 0.0;

        for (double valor : valoresEstados.values()) {
            valorTotal += valor;
        }

        for (Map.Entry<String, Double> entry : valoresEstados.entrySet()) {
            double percentual = (entry.getValue() / valorTotal) * 100.0;
            System.out.printf("Percentual de %s: %.2f%%\n", entry.getKey(), percentual);
        }
    }
}
