

public class Util {

    // 属性定义成私有的private 方法定义成共有的public
    private String name;

    Util(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getDay(int day) {
        // switch (day) {
        // case 1: // if ( day == 1)
        // return "星期一";

        // //有return 就不用 break;
        // //return 函数直接返回 了，下面的所有代码不会执行
        // case 2:
        // return "星期二";
        // case 3:
        // return "星期三";
        // case 4:
        // return "星期四";
        // case 5:
        // return "星期五";
        // case 6:
        // return "星期六";
        // case 7:
        // return "星期天";
        // default: //else 输出
        // return "没有这一天";
        // }

        // 顺序语句
        // 循环语句
        // 分支语句

        if (day == 1) {
            return "星期一";
        } else if (day == 2) {
            return "星期二";
        } else if (day == 3) {
            return "星期三";
        } else if (day == 4) {
            return "星期四";
        } else if (day == 5) {
            return "星期五";
        } else if (day == 6) {
            return "星期六";
        } else if (day == 7) {
            return "星期天 ";
        } else if (day == 6 || day == 7) {
           System.out.println("今天是周末");
           return "";
        } else{
            return "没有这么一天";
        }
        // ctrl + / 是注释
    }
    public String getAchievementByRecord(int record){
        // switch(record){
        //     case record>90||record<100:
        //     return "优秀";
        // }
        // switch（int）  case后面只能是一个int类型 不能是其他条件或者其他类型
        if(record >=90 && record <=100){
            return "优秀";
        }else if(record >=80 && record<=89){
            return "良好";
        }else if(record >=70 && record<=79){
            return "中等";
        }else if(record >=60 && record<=69){
            return "及格";
        }else if(record >=0 && record <=69){
            return "不及格";
        }else{
            return "考生没有考试或考试作弊暂时没有成绩";
        }
    }

   
    
}