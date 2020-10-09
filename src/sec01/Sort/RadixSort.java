package sec01.Sort;

import java.util.Arrays;

public class RadixSort {
    public static int[] rSort(int[] array) {
        for(int shift = Integer.SIZE -1; shift > -1; shift--) {
            int[] tmp = new int[array.length];
            int j = 0;

            for(int i=0; i<array.length; i++) {
                boolean move = array[i] << shift >= 0;
                if(shift == 0? !move: move) {
                    tmp[j] = array[i];
                    j++;
                } else {
                    array[ i-j ] = array[i];
                }
            }

            for(int i= j; i < tmp.length; i++) {
                tmp[i] = array[i-j];
            }
            array = tmp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {231,3,43,35,32,99,21};
        array = rSort(array);
        System.out.println(Arrays.toString(array));

        boolean m = array[0] << -50 >= 0;
        System.out.println(m);
        byte a = 20;
        byte b = (byte)(a>>2);
        System.out.println(b);
    }
}
