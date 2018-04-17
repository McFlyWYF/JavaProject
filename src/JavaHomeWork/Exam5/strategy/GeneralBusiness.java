package JavaHomeWork.Exam5.strategy;

public class GeneralBusiness implements Business{


    @Override
    public void strategyBusiness(double price) {
        System.out.println("普通会员"+price * 0.8);
    }
}
