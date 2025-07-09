public class Main{
  public static void main(String[] args){
    int a = 10;
    int b = 20;
    int c = 30;
    if(a>b){
      if(a>c){
        System.out.println("a is max element");
      }
      if(b>c){
         System.out.println("b is second max element");
      }
      else{
         System.out.println("c is second max element");
      }
  }
  else if(b>c){
     System.out.println("b is max element");
    if(a>c){
       System.out.println("a is second max element");
    }
    else{
       System.out.println("c is max element");
    }
  }
  else{
     System.out.println("c is max element");
    if(a>b){
       System.out.println("a is second max element");
    }
    else{
       System.out.println("b is second max element");
    }
  }
}
}
