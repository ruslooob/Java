import java.util.Arrays;

public class MyClass {
    //      or new int[]{1, 2, 3, 4, 4, 5, 6, 33, 1}
    int[] firstArray = {1, 2, 3, 4, 4, 5, 6, 33, 1};

    int[] secondArray = new int[5];

    MyClass() {
        secondArray[0] = 155;
        secondArray[1] = 126;
        secondArray[2] = 598;
        secondArray[3] = 955;
        secondArray[4] = 784;
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        Arrays.sort(secondArray);
        System.out.println(Arrays.toString(secondArray));

        System.out.println(Arrays.binarySearch(firstArray, 33));
        System.out.println(Arrays.binarySearch(secondArray, 999));
        
    }
}
