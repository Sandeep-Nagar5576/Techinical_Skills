// given an integer array find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith  element of the array.
public class returnArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int n=arr.length;
        int product=1;
        
        for(int i=0;i<n;i++){
            product*=arr[i];
        }


        int[] prod=new int[n];
        for(int i=0;i<n;i++){
            prod[i]=product/arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(prod[i]+" ");
        }
    }
    
}



// For the array {1, 2, 3, 4}:
// - Total product = 1\cdot 2\cdot 3\cdot 4=24
// - New array values:
// - 24/1=24
// - 24/2=12
// - 24/3=8
// - 24/4=6

// - Resulting array = {24, 12, 8, 6}
