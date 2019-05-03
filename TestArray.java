
public class TestArray {

    public static void main(String args[]) {
        System.out.println("sdfsf");
        int arr[] = { 1, 8, 3, 2, 5 };
        TestArray a = new TestArray();
        // int c = a.ddd(arr);
        // System.out.println(c);
        // a.tt();
        // int d = a.max(arr);
        // System.out.println(d);
        // int e = a.summation();
        // System.out.println(e);
        // int r = a.substraction(6000);
        // System.out.println (r);
        int r  = a.reversal(123);
        System.out.println(r);

    }

    public void stata() {
        System.out.println("hello world");
    }

    /**
     * 求数组里元素的总和
     * 
     * @param ad
     * @return
     */
    public int ddd(int ad[]) {
        int total = 0;
        for (int i = 0; i < ad.length; i++) {
            total = total + ad[i];
        }
        return total;
    }

    /**
     * 遍历数组里的每一个元素
     */
    public void tt() {
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 找出数组中最大的数
     * 
     * @param b
     * @return
     */
    public int max(int b[]) {
        int max = b[0]; // 定义一个数组 先拿到数组里的第一个元素
        for (int i = 1; i < b.length; i++) {// 遍历：然后从数组的第二位置开始对比 （如何后面的元素比max大的调换位置继续遍历）
            if (b[i] > max) {
                max = b[i];
            }
        }
        return max;
    }

    /**
     * 数字的求和
     * 
     * @return
     */
    public int summation() {
        int summation = 0;
        for (int i = 1; i <= 100; i++) {
            summation = summation + i;
        }
        return summation;
    }

    /**
     * 传一个数 然后把减去剩下的值 返回
     * 
     * @param num
     * @return
     */
    public int substraction(int num) {
        for (int i = 100; num >= i && i > 0; i--) {
            num = num - i;
        }
        return num;
    }
    /**
     * 数字的反转
     * @param a
     * @return
     */
    public int reversal(int a){
        int num = a;
        int i=num/100;
        int j=num%100/10;
        int k=num%10;
        return  k*100+j*10+i;
    }
}