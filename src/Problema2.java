public class Problema2 {

    public static void main(String[] args) {
        int [] arrayDeintregi={12, 16, 42, 36, 74, 10};

        double sum=0;
        double ma =0;

                for (int i=0; i<arrayDeintregi.length; i++) {
                    sum = sum+arrayDeintregi[i];
                    ma = sum / arrayDeintregi.length; }
        System.out.println(ma);
    }
}
