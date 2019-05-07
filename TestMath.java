public class TestMath {
    public static void main(String args[]) {
        System.out.println("90的正xuan值" + Math.sin(Math.PI / 2));
        System.out.println("0度的余xuan值" + Math.cos(0));
        System.out.println("60度的正切值" + Math.tan(Math.PI / 2));
        System.out.println("1的正反切值" + Math.atan(1));
        System.out.println("Math.PI");
    }

    double[] nums = { 1.4, 1.5, 1.6, -1.4, -1.5, -1.6 };for(
    double num:nums)
    {
        test(num);
    }
    }

  private static void test(double num) {   
    System.out.println("Math.floor(" + num + ")=" + Math.floor(num));   
    System.out.println("Math.round(" + num + ")=" + Math.round(num));   
    System.out.println("Math.ceil(" + num + ")=" + Math.ceil(num));   
  }

}