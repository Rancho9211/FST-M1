package activities;

import java.util.Arrays;

class Activity4 {
    public void insertionShot(int array[]) {
        int size = array.length;
        int i;
        for (i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }
    
    public static void main(String args[]) {
        int[] data = { 9, 5, 1, 4, 3 };
        System.out.println("Display the array before sorting.: ");
        System.out.println(Arrays.toString(data));
        Activity4 obj=new Activity4();
        obj.insertionShot(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}