// given an integer of size n,in one second you can increase the value of one element by 1 .find the minimum time in seconds to make all the elements of the array equal.

public class minTimeCounter {
    public static void main(String[] args) {
        int[] arr = {-1,4,-2,5};
        int n = arr.length;

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int time = 0;
        for (int i = 0; i < n; i++) {
            time=time+(max -arr[i]);
      }
    System.out.println(time);
    }
    
}

// observation
// to minimize the time ,make all the elements equal to the maximum element in the array.
// Step 1:-find the max element in the array 
// Step 2:-for each element calculate  hw much it needs to be increase to reach the maximum
// Step 3:- sum all those differences
//  time=time+(max -arr[i])


