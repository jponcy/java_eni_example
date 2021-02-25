package exception.calculatrice;

public class Operation {

    public static int ajouter(int a, int b) throws DepassementCapaciteException {
//        long aa = a;
//        long bb = b;
//        long result = aa + bb;
        // ----
//        long result = (long) a + b;
//
//        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
//            throw new DepassementCapaciteException();
//        }
//
//        return a + b;
        // ----
        int result = a + b;
        long test = (long) a + b;

        if (result != test) {
            throw new DepassementCapaciteException();
        }

        return result;
    }

    public static int soustraire(int a, int b) throws DepassementCapaciteException {
        int result = a - b;
        long test = (long) a - b;

        if (result != test) {
            throw new DepassementCapaciteException();
        }

        return result;
    }

    public static int multiplier(int a, int b) throws DepassementCapaciteException {
        int result = a * b;
        long test = (long) a * b;

        if (result != test) {
            throw new DepassementCapaciteException();
        }

        return result;
    }
    
//    public static int diviser(int a, int b) {
//        return a / b;
//    }
}
