public class array3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        sum(arr);
    }
    public static void sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            System.out.println("Sum of the array values :" + sum);
        }
    }
}
