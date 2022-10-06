import java.util.Random;//和import java.util.random.*;差在哪

class mechine implements Runnable{
    Random rand=new Random();
    static int total_ticket=100; 
    static int one_ticket;
    int each_all=0;
    Thread t;

    mechine(String name){
        one_ticket=0;
        t=new Thread(this,name);
        t.start();
    }
    public void run(){
        while(hasTicket()||total_ticket>0){
            one_ticket=rand.nextInt(3)+1;
            each_all=each_all+one_ticket;
            try{
                t.sleep(100);
               // System.out.println(t.getName()+"訂走了"+one_ticket+"張票");
            }catch(InterruptedException e){
                System.out.println("");    
            } 
        }
            System.out.println(t.getName()+"共訂走了"+each_all+"張票");
    } 
    synchronized private static boolean hasTicket(){
        if(total_ticket>0 ){
                total_ticket=total_ticket-one_ticket;
                return true;
        }else{
            return false;
         //   System.out.println(t.getName()+"共訂走了"+one_ticket+"張票");//static non-static問題
        }
    }
}       
public class w2_1_thread {
    public static void main(String[] args){
        mechine mA=new mechine("機台A");
        mechine mB=new mechine("機台B");
        mechine mC=new mechine("機台C");
        mechine mD=new mechine("機台D");

      //  System.out.println(所有機台+"共訂走了"+tA.each_all+"張票");
        //會爆掉的問題未解決
    }
}
