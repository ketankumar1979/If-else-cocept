package Ifelsedemo;

public class Ifelse2 {
    int minimumbalance = 5000;

    public static void main ( String[]args ){

        Ifelse2 obj = new Ifelse2();
        obj.condition1(6000 );
        obj.condition1( 7000);
        obj.condition1( 8000 );

        }
    public void condition1 ( int balance ){
        if ( balance >= minimumbalance ) {
            System.out.println(" gate will open ");
        }
        else {
            System.out.println ( " top of your card ");


    }
    }



}
