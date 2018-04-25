public class Question04 {
    static int[][] martix;
    static String str1 = "cnblogs";
    static String str2 = "belong";

    public void getQ4(){
        System.out.println("题目：");
        System.out.println("最长公共子序列的问题\n");

        martix = new int[str1.length() +1][str2.length()+1 ];

        LCS(str1,str2);

        System.out.println("当前最大公共子序列的长度为：" + martix[str1.length()][str2.length()]);
    }

    static void LCS(String s1, String s2){
        //初始化
        for (int i = 0; i <= str1.length(); i++) {
            martix[i][0]=0;
        }

        for (int i = 0; i <= str2.length(); i++) {
            martix[0][i]=0;
        }
        
        //填充边界
        for (int i = 1; i <= str1.length(); i++) {
            for (int i1 = 1; i1 <= str2.length(); i1++) {
                if (str1.charAt(i-1)  == str2.charAt(i1-1)){
                    martix[i][i1] = martix[i-1][i1-1] +1;
//                    System.out.println("xiangdeng");
                }else{
                    if(martix[i-1][i1] >= martix[i][i1-1])
                        martix[i][i1] =martix[i-1][i1];
                    else
                        martix[i][i1]=martix[i][i1-1];
                }
            }
        }
    }
}