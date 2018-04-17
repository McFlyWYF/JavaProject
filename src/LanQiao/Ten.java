package LanQiao;

//30人生日相同的概率计算，转化为碰撞问题
public class Ten {

    public static void main(String[] args) {

        final int N = 1000 * 100;

        int n = 0;
        for (int i = 0;i < N;i++){
            int[] x = new int[365];
            for (int j = 0;j < 30;j++){
                int p = (int)(Math.random() * 365);//产生随机数
                if(x[p] == 1){                     //初始化为1
                    n++;
                    break;
                }
                else x[p] = 1;
            }
        }
        double r = (double)n / N;
        System.out.println(r);
    }
}