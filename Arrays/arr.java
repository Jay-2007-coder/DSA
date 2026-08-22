
// public class arr {
// public static void main(String[] args) {
// int array[];
// array = new int[50];
// System.out.println(array.length);
// }
// }

// public class arr {
// public static void main(String[] args) {
// int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
// System.out.println(numbers.length);

// }
// }

// public class arr {
// public static void main(String[] args) {
// String numbers[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
// System.out.println(numbers.length);

// }
// }

// public class arr {
// public static void main(String[] args) {
// int marks[] = new int[100];
// marks[0] = 98;
// marks[1] = 76;
// marks[2] = 85;
// marks[3] = 95;
// marks[4] = 89;
// for (int i = 0; i < marks.length; i++) {
// System.out.println(marks[i]);
// }

// }
// }

// import java.util.*;

// public class arr {
// public static void main(String[] args) {
// int marks[] = new int[50];
// Scanner sc = new Scanner(System.in);
// marks[0] = sc.nextInt();
// marks[1] = sc.nextInt();
// marks[2] = sc.nextInt();
// marks[3] = sc.nextInt();
// marks[4] = sc.nextInt();
// System.out.println("Physics : " + marks[0]);
// System.out.println("Chemistry : " + marks[1]);
// System.out.println("Maths : " + marks[2]);
// System.out.println("English : " + marks[3]);
// System.out.println("Computer : " + marks[4]);
// marks[3] = 5; // update
// System.out.println("English : " + marks[3]);
// marks[3] = marks[2]; // update
// System.out.println("English : " + marks[3]);

// }
// }

// import java.util.*;

// public class arr {
// public static void main(String[] args) {
// int marks[] = new int[50];
// Scanner sc = new Scanner(System.in);
// marks[0] = sc.nextInt();
// marks[1] = sc.nextInt();
// marks[2] = sc.nextInt();
// System.out.println("Physics : " + marks[0]);
// System.out.println("Chemistry : " + marks[1]);
// System.out.println("Maths : " + marks[2]);
// int percentage = ((marks[0] + marks[1] + marks[2]) / 3);
// System.out.println("percentage" + percentage + "%");
// }
// }

// public class arr {
// public static void main(String[] args) {
// int marks[] = new int[50];
// System.out.println(marks.length);

// }
// }

// public class arr {
// public static void main(String[] args) {
// int[] a = { 1, 2, 3 };
// int[] b = a;// b now points to the SAME array as a

// b[0] = 99;
// System.out.println(a[0]); // prints 99, not 1!

// }
// }

// call by refernce
// public class arr {
// static void change(int array[]) {
// array = new int[] { 100, 200, 300 };
// }

// public static void main(String[] args) {
// int arr[] = { 10, 20, 30 };

// change(arr);

// System.out.println(arr[0]);
// }
// }

// public class arr {
// public static void update(int array[]) {
// for (int i = 0; i < array.length; i++) {
// array[i] = array[i] + 1;
// }
// }

// public static void main(String[] args) {
// // int marks[] = new int[20];
// // marks[0] = 1;
// // marks[1] = 4;
// // marks[2] = 5;
// int marks[] = { 10, 20, 30 };
// update(marks);
// for (int i = 0; i < marks.length; i++) {
// System.out.println(marks[i]);
// }

// }
// }

//linear Search 
// public class arr {
//     public static int linearSearch(int array[], int key) {
//         for (int i = 0; i <= array.length; i++) {
//             if (array[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]) {
//         int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//         int key = 7;
//         int index = linearSearch(array, key);
//         if (index == -1) {
//             System.out.println("Element not found");
//         } else {
//             System.out.println("Element found at index " + index);
//         }

//     }
// }

// public class arr {
//     public static int linearSearch(String array[], String key) {
//         for (int i = 0; i <= array.length; i++) {
//             if (array[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]) {
//         String array[] = { "apple", "banana", "kiwi", "mango" };
//         String key = "kiwi";
//         int index = linearSearch(array, key);
//         if (index == -1) {
//             System.out.println("Element not found");
//         } else {
//             System.out.println("Element found at index " + index);
//         }

//     }
// }

// 

// import java.util.*;

// public class arr {
//     public static int SmallestNumber(int array[]) {
//         int smallest = Integer.MAX_VALUE; // +infinity
//         for (int i = 0; i < array.length; i++) {
//             if (array[i] < smallest) {
//                 smallest = array[i];
//             }
//         }
//         return smallest;

//     }

//     public static void main(String args[]) {
//         int array[] = { 1, 2, 6, 3, 5, 0 };
//         System.out.println(SmallestNumber(array));
//     }
// }

//Binary Search
public class arr {
    public static int binarySearch(int array[], int key) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int array[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;
        int index = binarySearch(array, key);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }
    }
}