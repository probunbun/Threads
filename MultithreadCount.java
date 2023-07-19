public class MultithreadCount implements Runnable {
  private int threadNum;
  public MultithreadCount(int num1){
    threadNum=num1;
  }
  synchronized public void run(){
   try{ 
     for(int i=0; i<5; i++){
      System.out.println(i+" from thread "+threadNum);
      Thread.sleep(1000);
    }
      }catch(InterruptedException e){
        System.out.println("error");
      }
  }
}

