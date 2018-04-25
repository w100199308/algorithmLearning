public class ChickenQuestion {
    public void getChickQuestion(){
        System.out.println("题目：");
        System.out.println("公鸡5文钱一只，母鸡3文钱一只，小鸡3只一文钱，\n" +
                "用100文钱买一百只鸡,其中公鸡，母鸡，小鸡都必须要有，问公鸡，母鸡，小鸡要买多少只刚好凑足100文钱。\n");

        for (int x = 1; x <20; x++){
            for(int y = 1; y<33;y++){
                int z = 100-x-y;
                if((z % 3 == 0)&&(x*5+y*3+z/3==100)){
                    System.out.println("公鸡："+x+"只，母鸡："+y+"只，小鸡："+z+"只");
                }
            }
        }
    }
}
