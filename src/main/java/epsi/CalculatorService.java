package epsi;

import java.util.List;

public class CalculatorService {

    private final CalculatorAlgo algo = new CalculatorAlgo();

    /**
     * Additionne une liste de nombres en utilisant CalculatorAlgo
     */
    public int sum(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        // Correction : utilisation d'une lambda au lieu de method reference directe
        return numbers.stream()
                      .reduce(0, (a, b) -> algo.add(a, b));
    }

    /**
     * Multiplication d'une liste de nombres (bonus, si présent dans ton fichier)
     */
    public int multiply(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        return numbers.stream()
                      .reduce(1, (a, b) -> algo.multiply(a, b));
    }
}
