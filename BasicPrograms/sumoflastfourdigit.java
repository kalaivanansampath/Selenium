import java.util.*; 
import java.io.*;

class Main {

  public static int ArrayChallenge(int[] arr) {
    LinkedList<Integer> list = new LinkedList<Integer>();
    LinkedList<Integer> list1 = new LinkedList<Integer>();
    for(int i=0; i<arr.length ;i++){
      list.add(arr[i]);
    }
    Collections.sort(list);
    int n = list.size();
    for(int j =n-1;j>n-5;j--){
      list1.add(list.get(j));
    }
    int sum=0;
    for(int i=0; i<list1.size(); i++){
      sum = sum+list1.get(i);
    }
    return sum;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ArrayChallenge(s.nextLine())); 
  }

}