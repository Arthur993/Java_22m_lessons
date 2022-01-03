package com.company;

public class Main {

    public static void main(String[] args) {
	// Повтор урока по созданию одномерного массива(явный способ иницилизации массива)
        int[] intArray = new int[]{15, 8, 10, -5};
        int[] intArray1 = {15, 8, 10, -5};
        int[] intArray2 = new int[10];// неявный спосаб иницилизация массива

        intArray1 = new int[]{-5 , 0, 3};

        // how to obtain an element by its index
        int zeroElement = intArray[0];//15
        int firstElement = intArray[1];//8
        int secondElement = intArray[2];//10
        int thirdElement = intArray[3];//-5

        System.out.println(secondElement);
        System.out.println(firstElement);

        // how to set a new value to an element by its index
        intArray[2] = 12;//{15, 8, 12, -5}

        // how to figure out the length of an array

        int length = intArray.length;

        System.out.println(length);

        printArray(intArray);
        printArray(intArray1);
        printArray(intArray2);

        fillArrayIncreasingFrom0(intArray2);

        printArray(intArray2);
        printArray(intArray1);
    }

    static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }
    // Fill the array from 0 to (length -1)
    static void fillArrayIncreasingFrom0(int []array){
        for (int i = 0; i < array.length; i++) {
            array[i]= i;

        }
    }
}
