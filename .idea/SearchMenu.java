import java.util.ArrayList;
import java.util.Scanner;

public class SearchMenu {

    // Menu text
    String startMenu = "Please select one of the following options for search:\n" +
            "1. Binary Search\n" +
            "2. Linear Search\n" +
            "Enter your choice: ";

    // Method to display the menu and handle user input
    public void startMenu() {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,20,40,100};
        int[] array2 = {54, 26, 93, 17, 77, 31, 44, 55, 20, 67};


        while (true) {
            System.out.println(startMenu);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the target value for binary search:");
                    int target = scanner.nextInt();
                    int result = BinarySearch.binarySearchIterative(array, target);
                    if (result == -1) {
                        System.out.println("Element not present in the array.");
                    } else {
                        System.out.println("Element found at index " + result);
                    }
                    break;
                case 2:
                    System.out.println("Enter the target value for binary search:");
                    int target2= scanner.nextInt();
                    int result2= LinearSearch.linearSearch(array2,target2);
                    if (result2 == -1) {
                        System.out.println("Element not present in the array.");
                    } else {
                        System.out.println("Element found at index " + result2);
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1 or 2.");
            }
        }
    }
}