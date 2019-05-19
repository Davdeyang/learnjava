public  class Test{
    public static void main(String[] args) {
        /**
         * 构造方法
         * new一个类的时候自动调用   默认是没有的
         */
        Util  util = new Util("ddd");
        String dd = util.getDay(7);
        String add = util.getAchievementByRecord(900);
        System.out.println(add);
    }
}