package JavaHomeWork.Exam6.strategy;

public class BestBusiness implements Business {


    @Override
    public void strategyBusiness(double price) {
        System.out.println("高级会员" + price * 0.5);
    }
}
