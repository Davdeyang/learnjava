
public class TestArray{

    public static void main(String args[]) {
        System.out.println("sdfsf");
        int arr[] = {1,8,3,2,5};
        TestArray a = new TestArray();
        //int c = a.ddd(arr);
        //System.out.println(c);
        //a.tt();
        int d = a.max(arr);
        System.out.println(d);
    }

    public void stata() {
        System.out.println("hello world");
    }
    /**
     * 求数组里元素的总和
     * @param ad
     * @return
     */
    public int ddd(int ad[] ) {
        int total = 0;
        for (int i = 0; i < ad.length; i++) {
            total = total + ad[i];
        }
        return total;
    }
    /**
     * 遍历数组里的每一个元素
     */
    public void  tt(){
        int arr[] ={ 1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    /**
     * 找出数组中最大的数
     * @param b
     * @return
     */
    public int max(int b[]){
        int max = b[0]; //定义一个数组 先拿到数组里的第一个元素
        for(int i=1;i<b.length;i++){// 遍历：然后从数组的第二位置开始对比 （如何后面的元素比max大的调换位置继续遍历）
            if(b[i]>max){
                max=b[i];
            }
        }
        return max;
    }
}