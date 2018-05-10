public class Problema6 {
    public static void main(String[] args) {
        int[] arrayDeIntregi={7, 53, 20, 52};
        int max=arrayDeIntregi[0];
        int min=arrayDeIntregi[0];
        int sum=0;
        int dublu=0;

        for(int i=1;i<arrayDeIntregi.length;i++) {
            if(max<arrayDeIntregi[i])
                max=arrayDeIntregi[i]; }

            System.out.println("Numarul maxim este: " + max);

        for(int i=1;i<arrayDeIntregi.length;i++) {
            if(min>arrayDeIntregi[i])
                min=arrayDeIntregi[i]; }
        System.out.println("Numarul minim este: " + min);

        for(int i=0; i<arrayDeIntregi.length; i++) {
            sum = sum + arrayDeIntregi[i];         }
        System.out.println("Suma este: " + sum);


        }
}
