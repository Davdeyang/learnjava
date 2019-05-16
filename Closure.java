
//作用于
// int a;

public class Closure {

    // 全局变量
    static int money = 33;

    public static void main(String[] args) {
        System.out.println("hello world");
        // //局部变量
        Closure c1 = new Closure();
        // if(true){
        // int b =33;// if 的大括号不是一个单独的作用于
        // System.out.println(b);
        int arr[] = { 3, 34, 34, 5, 35, 35 };
        int arr1[] = { 2, 7, 4, 5, 3, 6 };
        c1.sort(arr1);
    }
    // 静态方法或者类方法 不用实例化就可以 类名.方法调用
    static void test() {
        System.out.println(money);
    }
    void ref(int a) {
        a = 33;
    }
    /**
     * 冒泡排序
     * 
     * @param arr1
     * @return
     */
    public void sort(int arr1[]) {
        int temp;
        for (int i = 0; i < arr1.length; i++) { // 外层循环控制每次循环的趟数
            for (int j = 0; j < arr1.length - 1; j++) { // 内层循环控制每趟的排序次数
                if (arr1[i] > arr1[j]) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("排序后的数组为");
        for (int num : arr1) {
            System.out.println(num+"");
        }
    }
}
