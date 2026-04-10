public class LLimplementation {
    public static void main(String[] args) {

        MyQueue q = new MyQueue();
        q.add(10);
        q.add(20);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(170);
        q.display();
        q.remove();
        q.remove();
        q.remove();
        q.display();


    }
}
