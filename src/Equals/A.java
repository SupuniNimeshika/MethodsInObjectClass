package Equals;

/**
 * Created by Supuni Nimeshika on 10/28/2018.
 */
public class A extends Object{
    public static void main (String args[]){
        A a =new A();
        A b =new A();
        A c =a;
        System.out.println(a.equals(b));// False
        System.out.println(a.equals(c));// True
    }

}
