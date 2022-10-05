import java.util.HashMap;
import java.util.Scanner;

public class w1_2_HM{
static Scanner scan =new Scanner(System.in);
  public static void main(String args[]){
  //建立HashMap
  HashMap<String,String>months=new HashMap<String,String>();
 String month[][]={{"1","January"},{"2","February"},{"3","March"},{"4","April"},{"5","May"},{"6","June"},{"7","July"},{"8","August"},{"9","September"},{"10","October"},{"11","November"},{"12","December"}};
    for(int i=0;i<12;i++){
    months.put(month[i][0],month[i][1]);  
    }
    int i;
    String input=null;
    do{
      System.out.print("請輸入1~12？　");
      //input=w1_1_HashMap.isInt();
            input=scan.nextLine();  
    }while(w1_2_HM.isMonth(input)!=true);
    //輸出結果
    i=Integer.parseInt(input);
    System.out.println("第"+i+"月的英文單字為"+months.get(input));     
}
  //還沒處理防呆
public static boolean isMonth(String words){
     boolean result=false;
    int  number=Integer.parseInt(words);//為什麼不能用ValueOf?
    if(number>0&&number<13){
      result=true;
     // System.out.println("收到！");
    }else{
      result=false;
      //System.out.println("範圍錯誤！");
    }
    return result;
}//為什麼不需要try-catch阿@@
/*老娘不防呆了^^氣爛
public static String isInt(){
     String result=null;
      int input=-1;
    boolean tag=false;
//  do{
    try{
      input=scan.nextInt();
      //int  number=Integer.parseInt(input);
      System.out.println("抓到了正確");
      result=Integer.toString(input);
      tag=true;
    }catch(Exception e){
      System.out.println("抓到了錯誤");
      // input=scan.nextInt();
      input=0;
      result=Integer.toString(input);
      tag=true;
    }
//  }while(tag!=true);
    return result;
}*/
  
}
//未解決的三個問題
//1.防呆try-catch
//2.方法取用問題 static non-static
//valueOf跟parseInt的差別