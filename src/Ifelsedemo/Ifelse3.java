package Ifelsedemo;

public class Ifelse3 {
    public static void main ( String[]args ){
        Ifelse3 obj = new Ifelse3();
        obj.compare(30, 50, 60 );

    }


    public void compare ( int a, int b, int c ){
        if ( a>b | a>c ) {
            System.out.println(" a is greater ");

        }
        else {
            if ( b>a | b>c ) {
                System.out.println(" b is greater ");
            }
            else {
                if ( c>a | c>b ){
                    System.out.println ( " c is greater ");

                }
            }

        }

    }
}
