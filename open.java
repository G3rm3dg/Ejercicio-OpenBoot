public class open {

    public static void main(String[] args) {
        int resultados = 0;
        int resultador = 0;
        int resultadom = 0;
        int resultadod = 0;
        int a = 100;
        int b = 2;
        resultados = suma(a, b);
        resultador = resta(a, b);
        resultadom = multiplicacion(a, b);
        resultadod = Division(a, b);
        System.out.println("el Resultado de la Suma es: " + resultados);
        System.out.println("el Resultado de la resta es: " + resultador);
        System.out.println("el Resultado de la Multiplicacion es: " + resultadom);
        System.out.println("el Resultado de la Division es: " + resultadod);
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int Division(int a, int b) {
        return a / b;
    }

}