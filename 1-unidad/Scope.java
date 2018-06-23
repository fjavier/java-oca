public class Scope{
    public static void main(String[] a){
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;
        System.out.println(three);
        Scope scope = new Scope();
    }

    protected void finalize(){
        System.out.println("Llamando al finalize");
    }
}
