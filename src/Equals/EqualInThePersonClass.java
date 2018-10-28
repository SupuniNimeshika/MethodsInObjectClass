package Equals;

/**
 * Created by Supuni Nimeshika on 10/28/2018.
 * Override the equal() in the Person class where two Person objects are equal when both
 * age and name applicants have the same values
 */
class EqualInThePersonClass {
    int age;
    String name;

    EqualInThePersonClass(int x, String s){
        age =x;
        name =s;
    }

    public boolean equals (Object o){
        if(this.age ==((EqualInThePersonClass)o).age && this.name.equals(((EqualInThePersonClass)o).name)){
            return true;
        }else {
            return false;
        }
    }

    public class A extends Object{
        public static void main(String[] args) {
            EqualInThePersonClass a = new EqualInThePersonClass(23,"Kamal");
            EqualInThePersonClass b = new EqualInThePersonClass(23,"Kamal");
            EqualInThePersonClass c = new EqualInThePersonClass(23,"Nimal");
            System.out.println(a.equals(b));
            System.out.println(a.equals(c));
        }
    }
}
