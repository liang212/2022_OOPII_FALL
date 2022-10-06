import java.util.HashMap;
import java.util.Scanner;
public class w1_2_2_HM{
  static  Scanner scan =new Scanner(System.in);
  public static void main(String args[]){
    //建立HashMap
    HashMap<String,String>months=new HashMap<String,String>();
    String month[][]={{"1","January"},{"2","February"},{"3","March"},{"4","April"},{"5","May"},{"6","June"},{"7","July"},{"8","August"},{"9","September"},{"10","October"},{"11","November"},{"12","December"}};
    for(int i=0;i<12;i++){
      months.put(month[i][0],month[i][1]);  
    }
    int i;
    String input;
    boolean isMonth;
    do{
      scan.reset();
      input=w1_2_2_HM.isInt();
      isMonth = w1_2_2_HM.isMonth(input);
      scan.reset();
    }while(!isMonth);
    //輸出結果
    i=Integer.parseInt(input);
    System.out.println("第"+i+"月的英文單字為"+months.get(input));     
}
public static boolean isMonth(String words){
    boolean result=false;
    int  number=Integer.parseInt(words);
    if(number>0&&number<13){
      result=true;
     }else{
      result=false;
      System.out.println("範圍錯誤！!");
    }
    return result;
}
public static String isInt(){
    String result="0";
    int input=-1;
    boolean tag=false;
     try{
        System.out.println("請輸入1~12? ");
        result=scan.next();
        input=Integer.parseInt(result);
        tag=true;
        return result;
    }catch(Exception e){
      System.out.println("範圍錯誤！");
     return w1_2_2_HM.isInt();
    }
}
}
//未解決的兩個問題
//方法取用問題 static non-static
//valueOf跟parseInt的差別

//這樣整數神奇的成功，英文字還是失敗
