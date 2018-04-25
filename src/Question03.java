public class Question03 {
    public void getQ3(){
        System.out.println("题目：");
        System.out.println("猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾就多吃了一个。第二天早上又将剩下的桃子吃了一半，还是不过瘾又多\n" +
                "吃了一个。以后每天都吃前一天剩下的一半再加一个。到第10天刚好剩一个。问猴子第一天摘了多少个桃子？\n");

        int n = 0;
        n = getNum(10, n);
    }

    Integer getNum(int i, int n){
        int k = n;
        i--;
        if(i != 0){
            k = (getNum(i, k) + 1)*2 ;
        }else{
            k = 1;
        }

        System.out.println(String.format("第%d天有桃子%d个", 10-i, k));

        return k;
    }
}
