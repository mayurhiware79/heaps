import java.util.*;
public class insert_heap {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){ //O(logn)
            //add at last idx
            arr.add(data);
            
            int x = (arr.size()-1); //x is child idx
            int par = (x-1)/2; //par index

            while(arr.get(x) < arr.get(par)){ //O(logn) ---tree levels
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }
        }
    }

    public static void main(String[] args) {
        
    }
    
}
