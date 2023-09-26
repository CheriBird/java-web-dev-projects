public class arrayPractice {

    public static void main(String[] args) {
        int[] numArray = {1, 1, 2, 3, 5, 8};

        // print every value in the array
        System.out.println("All numbers in the array:");
        for (int num: numArray) {
            System.out.println(num);
        }
        
        // print only odd numbers from the array
        System.out.println("Only the odd numbers in the array:");
        for (int num: numArray) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}
