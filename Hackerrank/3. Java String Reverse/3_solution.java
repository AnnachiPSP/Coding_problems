import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    int k=0;
    for(int i = 0,j = A.length()-1; i < A.length(); i++,j--){
      if(A.charAt(i)!=A.charAt(j)){
        k = 1;
        break;
      }
    }
    if(k == 0) System.out.println("Yes");
    else System.out.println("No");
  }
}
