/**
 * Created by chenyzh on 2017/8/31.
 */
public class Equals {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str1=new String("");
        String str2=new String("");
        String shortstr1=str1.replaceAll("\\s","");  //去掉所有空格，包括两头和中间
        String shortstr2=str2.replaceAll("\\s","");
        if(shortstr1.equals(shortstr2)){
            System.out.println("ture");
        }else{
            System.out.println("false");
        }


    }
}
