public class revArray1 {

        public static void main(String[] args) {
            int arr[] = new int[] { 1, 2, 3, 4, 5 };
            reverseArr(arr);
        }

        public static void reverseArr(int arr[]) {
            int start = 0;
            int end = arr.length-1;

            while(start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

            //printing array
            for(int i : arr) {
                System.out.print(i+" ");
            }
        }

}