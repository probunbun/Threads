public class App {
    int threadNum=0;
  static int count=0;
  public static void main(String[] args) {
    for(int i=0; i<3; i++){
      MultithreadCount one = new MultithreadCount(i);
      Thread first = new Thread(one);
      MultithreadListen second = new MultithreadListen();
      first.start();
      second.start();
    }
  }
}