import java.math.BigDecimal;
/*
Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
(Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum,
crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo
 */
public class Main {
    public static void main(String[] args) {
        BigDecimal bd1 = BigDecimal.valueOf(7.67);
        BigDecimal bd2 = BigDecimal.valueOf(8.32);
        operate(bd1, bd2, AritOperations.SUM);
        operate(bd1, bd2, AritOperations.MULTIPLICATION);
    }
    enum AritOperations {
        SUM,
        SUBTRACTION,
        MULTIPLICATION,
        DIVISION;
    }
    public static void operate(BigDecimal bd1, BigDecimal bd2, AritOperations operation) {
            BigDecimal result = BigDecimal.valueOf(0);
            switch (operation) {
                case SUM:
                    result = result.add(bd1).add(bd2);
                    System.out.println("Resut of sum: " + result);
                    break;
                case SUBTRACTION:
                    result = result.add(bd1).subtract(bd2);
                    System.out.println("result of subtraction: " + result);
                    break;
                case MULTIPLICATION:
                    result = result.add(bd1).multiply(bd2);
                    System.out.println("result of multiplication: " + result);
                    break;
                case DIVISION:
                    result = result.add(bd1).divide(bd2);
                    System.out.println("result of division: " + result);
                    break;
                default:
                    System.out.println("Please choose a valid operation");
            }
    }
}