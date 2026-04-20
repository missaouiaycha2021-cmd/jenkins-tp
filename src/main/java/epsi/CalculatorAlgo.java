package epsi;

/**
 * The computation methods..
 *
 */
public final class CalculatorAlgo {

    /**
     * Adds two numbers.
     * @param a the first number
     * @param b the second number
     * @return the result of a + b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    private CalculatorAlgo() {
        throw new IllegalArgumentException("Utility class - do not instantiate");
    }
cat >> src/main/java/epsi/CalculatorAlgo.java << 'EOF'

    // Squelette pour la multiplication (Exemple 5 - TDD)
    // On retourne 0 temporairement → les tests vont échouer
    public int multiply(int a, int b) {
        return 0;
    }
EOF
}
