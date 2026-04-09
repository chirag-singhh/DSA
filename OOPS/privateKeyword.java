   class Students{
        private int rno=55;
        String name;
        double cgpa=10;
        private void print (){
            System.out.println(name+" "+cgpa+" "+rno);
        }
        public void p (){
            print();
        }
        //getter
        void  printrno(){
            System.out.println(rno);
        }
        //setter
        void setrno(int x){
            rno = x;
        }
    }
public class privateKeyword {
  
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name="Chirag";
        s1.printrno();
        s1.setrno(50);
        s1.printrno();
        
    }
}
