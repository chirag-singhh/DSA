public class preinpost {
    public static void main(String[] args) {
        pip(2);
    }

    private static void pip(int i) {
       if(i ==0) return;
       System.out.println(i); //pre
       pip(i-1);
       System.out.println(i); //in
       pip(i-1);
       System.out.println(i); //post
    }
}
