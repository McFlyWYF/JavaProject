    package LanQiao;

    //求n个元素的全排列

    public class Two {

        public static void f(char[] data,int k){

            //k：当前的交换位置，与其后的元素交换
            if (k == data.length) {
                for (int i = 0; i < data.length; i++) {
                    System.out.print(data[i] + " ");                  //打印
                }
                System.out.println();
            }

            for(int i = k;i < data.length;i++) {
                {                                   //试探，交换位置
                    char t = data[k];
                    data[k] = data[i];
                    data[i] = t;
                }

                f(data, k + 1);                   //递归

                {                                    //回溯
                    char t = data[k];
                    data[k] = data[i];
                    data[i] = t;
                }
            }
        }

        public static void main(String[] args) {
            char[] data = "ABC".toCharArray();
            f(data,0);
        }
    }
