public class Question02 {
    public void getQ2(){
        System.out.println("题目：");
        System.out.println("五家人共用一口井，甲家的绳子用两条不够，还要再用乙家的绳子一条才能打到井水；乙家的绳子用三条不够，还要再用丙家的绳子\n" +
                "一条才能打到井水；丙家的绳子用四条不够，还要再用丁家的绳子一条才能打到井水；丁家的绳子用五条不够，还要再用戊家的绳子一条才能打\n" +
                "到井水；戊家的绳子用六条不够，还要再用甲家的绳子一条才能打到井水。\n" +
                "最后问：井有多深？每家的绳子各有多长？\n");

        for (int i=1; i<5; i++){
            int a = 265*i;
            int b = 191*i;
            int c = 148*i;
            int d = 129*i;
            int e = 76*i;
            int h = 721*i;

            System.out.println(String.format("a=%d,b=%d,c=%d,d=%d,e=%d ------h=%d", a, b, c, d, e, h));
        }
    }
}
