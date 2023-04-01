import java.util.*;

public class NSE {

    public static void prevSmallerElement(int A[]) {
        Stack<Integer> s = new Stack<>();
        
        for (int i = 0; i < A.length; i++) {
            while(!s.isEmpty() && s.peek() >= A[i]) {
                s.pop();
            }

            if(s.isEmpty()) {
                System.out.print("-1 ");
            }
            else {
                System.out.print(s.peek() + " ");
            }

            s.push(A[i]);
        }
    
    }

    public static void main(String[] args) {
        int[] A = { 4, 10, 5, 8, 20, 15, 3, 12 };
        prevSmallerElement(A);
    }
}
