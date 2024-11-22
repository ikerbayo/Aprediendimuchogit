public class Operaciones {

    public static int sumar(int a, int b) {
        return a + b;
    }
    
    public static int restar(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Operaciones ops= new Operaciones();
        int suma= ops.sumar(10, 5);
        System.out.println(" El resultado de la suma es : " + suma);
        int resta = ops.restar (10, 5);
        System.out.println("El resultado de la resta es : " + resta);
    }
}
