package Ifelsedemo;

public class Ifelse4 {
    public void compare ( int a, int b, int c ){
        if (a>=b && a>=c){
            System.out.println ( " a is greater or equal ");
        }
        else
        { if ( b>=a && b>=c ) {
            System.out.println(" b is greater or equal ");
        }
        else
        { if ( c>=a && c>=b ) {
            System.out.println(" c is greater or equal ");
        }
        }
        }

        }


    public static  void main ( String[]args ){
        Ifelse4 obj = new Ifelse4();
        obj.compare( 50,60,70 );

    }
}
