import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue_using_JCF {
    public static void main(String args[]){
         //sorts integers in ascending order
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //sorting integers in reverse priority desending
        pq.add(2); //O(logn)
        pq.add(5);
        pq.add(1);
        pq.add(6);

        while(!pq.isEmpty()){
            System.out.println(pq.peek()); //O(1)
            pq.remove(); //O(logn)
        }
    }
}