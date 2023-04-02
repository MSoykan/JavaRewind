package bolum_12_collection_frameworkler.list_interface;

import java.util.Stack;

public class StackKullanimi {
    
    public static void main(String[] args) {
        Stack<String> yigin=new Stack<>();

        yigin.add("Emre");
        yigin.add("Hasan");
        yigin.add("Ali");

        System.out.println(yigin.pop());
        System.out.println(yigin);
        System.out.println(yigin.pop());
        System.out.println(yigin);
        System.out.println(yigin.peek());
        System.out.println(yigin.push("Can"));
        System.out.println(yigin.peek());

        System.out.println(yigin.add("Sona ekledim"));
        System.out.println(yigin);
    }
}
