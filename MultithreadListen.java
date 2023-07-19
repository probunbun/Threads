public class MultithreadListen extends Thread {
  synchronized public void run(){
   try{ 
     for(int i=0; i<2; i++){
      System.out.println(i);
       Thread.sleep(1000);
    }
      }catch(InterruptedException e){
        System.out.println("error");
      }
  }
}