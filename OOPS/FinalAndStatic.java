public class FinalAndStatic {
    public static class Cricketer{
        int runs;
        String name;
        double avg;
        static String country = "NZ"; // shareable varible country box bnega hi ni c1 me
        // final String country = "India";
    }
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
         Cricketer c2 = new Cricketer();
          c1.country = "INDIA";
        System.out.println(c1.country);
        // c1.country = "Englalnd"; nhi kr skta final h
       System.out.println(c2.country);
    
    
    }
}
