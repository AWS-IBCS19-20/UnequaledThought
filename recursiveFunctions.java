import java.util.*;
//Kaylah Tan

public class recursiveBacktracking {
  public int sum;
  public int nextSum;
  public recursiveBacktracking(){

  }

public boolean groupSum(int start, int[] a, int s){
  sum = a[start];
  nextSum = nextSum + sum;
  if (nextSum == s) {
    return true;
  } else {
    if (start+1 == s) {
      return true;
    } else {
      if (start+1 == a.length) {
        return false;
      } else {
        groupSum(start+1, a, s);
      }

    }
    return false;
  }

  public static void main(String[] args) {
    recursiveBacktracking r = new recursiveBacktracking();
    int start = 0;
    int[] a = {3,5,6};
    int s = 8;
    System.out.println(r.groupSum(start,a,s));
  }
    }
