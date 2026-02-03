// "How many elements in the array are greater than the first element?
class findMax {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int max=0;
        int count=0;
        for (int i=0; i<numbers.length; i++){
            if(numbers[i]>numbers[0]){
                max=numbers[i];
        if(max==numbers[i])
                count++;
            }
        
        }
        System.out.println(count);

    }
}



// - The loop checks each element against numbers[0].
// - If an element is greater, it assigns it to max and increments count.
// - Finally, it prints count.
// For your array {10, 20, 30, 40, 50}, the elements greater than 10 are 20, 30, 40, 50. That’s 4 elements, so the output is 4.
