import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 4. циклы");
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 != 0) {
                System.out.print(arr[i] + ":" + " ping" + '\n');
            } else {
                if (arr[i] % 5 == 0 && arr[i] % 3 != 0) {
                    System.out.print(arr[i] + ":" + " pong" + '\n');
                } else {
                    if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                        System.out.print(arr[i] + ":" + " ping pong" + '\n');
                    } else {
                        System.out.println(arr[i] + ":");
                    }
                }
            }
        }
        System.out.println("Задание 5. циклы");
        int a = 0;
        int b = 1;
        int[] arrFibonachi = new int[10];
        arrFibonachi[0] = a;
        arrFibonachi[1] = b;
        for (int i = 2; i < arrFibonachi.length; i++) {
            arrFibonachi[i] = arrFibonachi[i - 2] + arrFibonachi[i - 1];
        }
            System.out.println(Arrays.toString(arrFibonachi));
        }
    }
