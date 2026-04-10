class CircularQueue{
    int[]arr;
    int r;
    int f;
    int size;

    CircularQueue(int val){
        arr = new int[val];
    }

    void add(int val){
        if(size == arr.length){
            System.out.println("Queue is Full");
            return;
        }
        arr[r++] = val;
        if(r==arr.length) r=0;
        size++;
    }

    void remove(){
        if(size == 0){
            System.out.println("Queue is Empty");
            return;
        }
        f++;
        if(r==arr.length) r=0;
        size--;

    }

    int peek(){
        if(size == 0){
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[f];

    }

    void display(){
        if(size == 0) return;
        if(f>=r){
            for(int i = f;i<arr.length;i++){
                System.out.println(arr[i]+" ");

            }
            for(int i = 0;i< r;i++){
                System.out.println(arr[i]+" ");

            }


        }
        else{
            for(int i = f ; i < r ; i++){
                System.out.println(arr[i]+" ");
            }
            System.out.println();
        }
    }
}

public class CircularArrayImplementation {
    public static void main(String[] args) {
    CircularQueue q = new CircularQueue(5);

    q.add(10);
    q.add(20);
q.add(30);
    q.add(40);

    q.display();
    q.remove();

        q.display();

    }
}
