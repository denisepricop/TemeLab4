public class Problema3 {

    public static void main(String[] args) {
        int [] arrayDeintregi={8, 59, 14, 3, 68, 57};

        int i=0;
        double sum=0;
        double ma =0;

        do {
            sum = sum+arrayDeintregi[i];
            ma = sum / arrayDeintregi.length; i++; }

            while (arrayDeintregi[i]==0);
        System.out.println(ma);

        }
}

