public class Sort {

    public static void main(String args[]) {

        int arr[] = { 1, 5, 6, 3, 2, 4 };
        Sort sort = new Sort();
        int ar1[] = sort.bubbleSort(arr, "ESC");
        for (int num : ar1) {
            System.out.println(num + "");
        }
    }
    /**
     * 冒泡排序
     * @param arr 整数类型数组
     * @param sortType 排序类型 顺序传 ESC  倒序  DESC
     * @return
     */
    public int[] bubbleSort(int arr[], String sortType) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (sortType == "ESC") {
                    if (arr[i] < arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                } else {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

        }
        return arr;
    }
    public int [] insertSort(int [] arr,String sortType){

        return arr;
    }

}