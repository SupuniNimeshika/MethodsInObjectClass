package Equals;

/**
 * Created by Supuni Nimeshika on 10/28/2018.
 * A= OverridingTheEqual () easy to understand
 */
public class OverridingTheEqual extends Object {

    public boolean equals (Object o){
        return true;
    }

    public static void main(String[] args) {
        OverridingTheEqual a = new OverridingTheEqual();
        OverridingTheEqual b =new OverridingTheEqual();
        OverridingTheEqual c =a;
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}
