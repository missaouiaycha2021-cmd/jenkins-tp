cd ~/tp-jenkins

# 1. Voir le contenu actuel du fichier (pour confirmation)
cat src/main/java/epsi/CalculatorAlgo.java

# 2. Remplacer tout le contenu par une version propre
cat > src/main/java/epsi/CalculatorAlgo.java << 'EOF'
package epsi;

public class CalculatorAlgo {

    public int add(int a, int b) {
        return a + b;
    }

    // === SQUELETTE MULTIPLICATION (Exemple 5 - TDD) ===
    // On retourne 0 temporairement (les tests vont échouer)
    public int multiply(int a, int b) {
        return 0;
    }
}
EOF
