package sec01.Sort;

public class QuickSort {


    //교환 메서드
    private static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

    //양쪽 파티션을 나누고 교환 수행 후 start 포인터 정수를 리턴
    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start+end)/2]; //가운데 위치한 값을 피봇값으로 설정
        while(start <= end) {
            while(arr[start] < pivot) start++;
            while(arr[end] > pivot) end--;
            if(start<=end) { //양쪽 포인터가 멈췄을때 start값이 end값을 넘어서지 않을 경우에만 swap

                swap(arr, start, end);

                start++;
                end--;
            }
        }
        return start; //start값이 end값을 넘어설때 리턴
    }

    private static void quickSort(int[] arr, int start, int end) {
        int part2 = partition(arr, start, end); //파티션의 오른쪽방 첫번째값
        if (start < part2 - 1) { //왼쪽방의 데이터가 하나뿐인경우
            quickSort(arr, start, part2-1);
        }
        if(part2 < end) { //오른쪽 파티션의 배열방이 마지막값보다 작을경우에만 정렬
            quickSort(arr, part2, end);
        }

    }

    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length -1);
    }

    private static void printArray(int[] arr) {
        for (int data : arr) {
            System.out.println(data+", ");
        }
        System.out.println();
    }





    public static void main(String[] args) {
        int[] arr = {5,9,3,7,6,8};
        int value = partition(arr,0,5);
        System.out.println(value);
        int pivot = 5/2;
        System.out.println(pivot);
    }

}
