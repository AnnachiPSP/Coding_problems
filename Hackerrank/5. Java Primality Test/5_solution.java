import java.math.*;
import java.util.*;

public class Solution {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String n = scanner.nextLine();
    BigInteger bn=new BigInteger(n);
    if(bn.isProbablePrime(1)){
      System.out.println("prime");
    }
    else{
      System.out.println("not prime"); 
    }
    scanner.close();
  }
}
