package JavaHomeWork.Exam6.strategy;

import JavaHomeWork.Exam6.strategy.Business;

public class GeneralBusiness implements Business {


    @Override
    public void strategyBusiness(double price) {
        System.out.println("普通会员"+price * 0.8);
    }
}
