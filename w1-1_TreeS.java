import java.util.TreeSet;
import java.util.Random;
import java.util.ArrayList;
//此方式會出現安全性問題，需再想方法更改。

public class w1-1_TreeS{
  public static void main(String args[]) {
    // 先亂數取十個數字
    Random rand = new Random();
    ArrayList st = new ArrayList();
    for (int i = 0; i < 11; i++) {
      st.add(rand.nextInt(100) + 1);
    }
    int count = 0;
    for (int i = 1; i <=10; i++) {
      System.out.println("第" + i + "個號碼：" + st.get(i));
      count++;
    }
    System.out.println("物件內元素個數為:" + count);
    System.out.println("物件內元素內容:" + st);
    // 建立TreeSet
    TreeSet<Integer> Tset = new TreeSet();
    Tset.addAll(st);
    // 結果輸出
    System.out.println("第一個元素內容為:" + Tset.first());
    System.out.println("最後一個元素內容為:" + Tset.last());
    Tset=(TreeSet)Tset.subSet(30,70);
    System.out.println("內容介於30~70者:"+ Tset);


  }

}
