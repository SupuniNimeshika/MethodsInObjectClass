package a;

/**
 * Created by Supuni Nimeshika on 10/28/2018.
 */
public class overridingtoString {

    public String toString(){
        return "Hi";
    }


    public static void main (String args[]){
        overridingtoString a =new overridingtoString();
        System.out.println(a);
        System.out.println(a.toString());


    }
}
