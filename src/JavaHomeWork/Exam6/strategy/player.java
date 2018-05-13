package JavaHomeWork.Exam6.strategy;


public class player {

    private String Id;
    private Business business;


    public void id(String Id){
        if (Id.equals("普通会员")){
            business = new GeneralBusiness();
        }else if (Id.equals("高级会员")){
            business = new BestBusiness();
        }
    }

    public void Allprice(double price){
        business.strategyBusiness(price);
    }
}
