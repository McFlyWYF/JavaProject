package JavaHomeWork.Exam5.strategy;

public class StrategyDemo {

    public static void main(String[] args) {
        player p = new player();
        p.id("普通会员");
        p.Allprice(1000);

        p.id("高级会员");
        p.Allprice(1000);
    }
}
