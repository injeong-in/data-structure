package sec02.Sort;

public class QuickSort {

    void quickSort(int[] arr) {
        //시작위치와 끝나는 위치를 정한 재귀함수 호출
        quickSort(arr, 0, arr.length-1);
    }

    void quickSort(int[] arr, int start, int end) {

        int part2 = partition(arr, start, end);
        //나눈 파티션의 오른쪽과
        if(start < part2 - 1) {
            quickSort(arr, start, part2 -1); //재귀호출 1
            if(part2 < end) {
                quickSort(arr, part2, end); //재귀호출 2
            }
        }
    }

    int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2]; //배열의 중앙값을 피벗으로 설정
        while (start <= end) { //시작 인덱스(왼쪽 포인터)가 끝 인덱스(오른쪽 포인터)를 초과하는 순간 종료
            while (arr[start] < pivot) start++; //start 포인터가 피봇보다 큰값이 나오면 멈추고, 작은값이면 인덱스가 증가한다.
            while (arr[end] > pivot) end--; // end 포인터가 피봇보다 작은값이 나오면 멈추고, 큰값이면 인덱스가 감소한다.
            if (start<=end) {
                swap (arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void printArray(int[] arr) {
        for (int data : arr) {
            System.out.print(data + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,7,4,3,9,8};

        QuickSort q = new QuickSort();
        printArray(arr);
        q.quickSort(arr);
        printArray(arr);

    }

}
