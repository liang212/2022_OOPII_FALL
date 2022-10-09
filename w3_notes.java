/*
lambda筆記
實務上最近很常用，若物件導向很熟，
可以減輕許多程式撰寫的麻煩

像一個方法，依照不同的輸入值，傳回輸出值

搜尋到方法，找到並傳出來
java裡面: (某種方法)－>輸出一值 lambda的寫法
[更改前]
Thread t=new Thread
(
  new Runnable(){
    public void run(){
      for(int i=1;i<=10;i++){
        System.out.println(Thread.currentThread().getName()+":印第"+i+"次");
      }
    }
  }
);
[改為lambda後]
Thread t=new Thread()->{//即無須再寫實做介面
  for(int i=1;i<10;i++){
    System.out.println(Thread.currentThread().getName()+":印第"+i+"次"); 
  }
}

語法結構:(input引數)->{body程式主體}
*///沒有lambda的
/*
class AT implements Runnable {
  // 範例一，用Runnable介面實行一個執行緒
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(Thread.currentThread().getName() + "印第" + i + "次");
    }
  }

}

public class Class_1006 {
  public static void main(String[] args) throws Exception {
    AT b = new AT();
    Thread t = new Thread(b);
    // b.run();//main印第10次－輸出結果
    // 需要先run才會跑出來，不是new完就會進入runnable//
    t.start();// Thread-0印第10次－輸出結果
  }
}*/

//用lambda簡化了 即不需要實作*/
/*要注意括號的位置，缺點:每次都要再重打一次*/
/*public class Class_1006 {
  public static void main(String[] args) throws Exception {
    Thread t = new Thread(()->{
      for (int i = 1; i <= 10; i++) {
          System.out.println(Thread.currentThread().getName() + "印第" + i + "次");
    }      
  });
    t.start();// Thread-0印第10次－輸出結果
  }
}
*/

/*
 * 我寫的奇怪東西
 * class Class_1006 {// 範例一，用Runnable介面實行一個執行緒
 * Thread b=new Thread()->{
 * for(int i=1;i<11;i++){
 * System.out.println(t.currentThread().getName()+"印第"+i+"次");
 * }
 * }
 * public static void main(String[] args) {
 * Thread b=new Thread();
 * b.run();
 * }
 * }
 */


/*swing套件，處理事件監聽
只有一個方
法的介面物件可直接使用Lambda
1. Runnable介面的run()方法
2. Swing事件ＡctionListener介面的actionPerformed()方法
*/


/*監看有沒有按按鈕，有的話即傳回
button.addActionListener(new ActionListener(){//按鈕上加監聽器
  public void actionListener(ActionEvent e){//若有按，則e傳入執行
    JOptionPane.showMessageDialog(null,"處理事件");
  }//
});
*/

/*Lambda簡潔化 及提升程式效能(除非程式跑很大，不然沒感覺)*/
/*
button.addActionListener((e)->JOptionPane.showMessageDialog(null,"處理事件"));
*/

/*
寫法:方法參考 省略Lambda的運算式:: 
Arrays.sort(name,(str1,str2)->str1.compareToIgnoreCase(str2));
參考使用了string類別的compareToCase()方法，省略引數
Arrays.sort(name,String::compareToIgnoreCase);
*/

/*try!寫排序~lambda在不少程式語言都有(ex:php)*/
//用lambda寫
/*
import java.util.Arrays;

public class Class_1006{
  public static void main(String[] args){
    String[] name=new String[]{"Mimi","apple","jacky","peter","alice"};
  Arrays.sort(name,(str1,str2)->str1.compareToIgnoreCase(str2));
  for(int i=0;i<name.length;i++){
    System.out.println(name[i]);
  }
  } 
}
*/


/*參照方法，省略引數
java API參數引用
*/
import java.util.Arrays;

public class Class_1006{
  public static void main(String[] args){
    String[] name=new String[]{"Mimi","apple","jacky","peter","alice"};
     Arrays.sort(name,String::compareToIgnoreCase);
  for(int i=0;i<name.length;i++){
    System.out.println(name[i]);
  }
  } 
}
