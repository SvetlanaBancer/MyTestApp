package org.softpost;

/**
 * Hello world!
 *
 */
public class App 
{
    String Name;
    int ID;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        print1();
        print2();
    }

    private static void print1(){
        System.out.println( "Print" );
        for(int i=1;i<10;i++){
            System.out.println(i);
        }
    }

    private static void print2(){
        System.out.println( "Print" );
        for(int i=1;i<10;i++){
            System.out.println(i);
        }
    }
}
