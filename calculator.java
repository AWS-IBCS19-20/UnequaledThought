//Calculator.java by Kaylah Tan
import java.util.*;

class calculator {
  private int result;

  public calculator() {
    result = 0;
  }

  public int add (int int1, int int2) {
    result = int1 + int2;
    return result;
  }

  public int sub (int int1, int int2) {
    result = int1 - int2;
    return result;
  }

  public int divide (int int1, int int2) {
    result = int1 / int2;
    return result;
  }

  public int multiple (int int1, int int2) {
    result = int1 * int2;
    return result;
  }

  public int exponent (int int1, int int2) {
    result = 1;
    // (start value ; end value ; add 1 for i)
    for (int i = 0; i < int2; i++) {
      result = result * int1;
    }
    return result;
  }

  public int factorial (int int1) {
    result = 1;
    for(int i = int1; i > 0; i--) {
      result = result * i;
    }
    return result;
  }


  public double average (int int1, int int2, int int3) {
	  result = (int1 + int2 + int3) / 3;
	  return result;
  }

  public int median (int int1, int int2, int int3) {
	  if ((int1 > int2 && int1 < int3) || (int1 > int3 && int1 < int2)) {
			 result = int1;
		  } else if ((int2 > int1 && int2 < int3 ) || (int2 > int3 && int2 < int1)) {
			  result = int2;
		  } else {
			  result = int3;
		  }
  	return result;
  }

  public int maximum (int int1, int int2, int int3) {
	  if (int1 > int2 && int1 > int3) {
		 result = int1;
	  } else if (int2 > int1 && int2 > int3) {
		  result = int2;
	  } else {
		  result = int3;
	  }
	  return result;
  }

  public int minimum (int int1, int int2, int int3) {
	  if (int1 < int2 && int1 < int3) {
		 result = int1;
	  } else if (int2 < int1 && int2 < int3) {
		  result = int2;
	  } else {
		  result = int3;
	  }
	  return result;
  }


  public double percentChange (int int1, int int2) {
	  result = (int2 - int1) * 100 / int1;
	  return result;
  }

  public static void main(String[] args) {
    calculator c = new calculator();
    int x = 3;
    while (x == 3) {
      System.out.println("What do you want calculated:");
      System.out.println("1. Add");
      System.out.println("2. Subtract");
      System.out.println("3. Multiple");
      System.out.println("4. Divide");
      System.out.println("5. Exponent");
      System.out.println("6. Factorial");
      System.out.println("7. Average");
      System.out.println("8. Median");
      System.out.println("9. Minimum");
      System.out.println("10. Maximum");
      System.out.println("11. Percent Change");
      Scanner choice = new Scanner(System.in);
      int ch = choice.nextInt();

	      // add
      if (ch == 1) {
    	  System.out.println("Give the first number to add.");
    	  int input1 = choice.nextInt();
    	  System.out.println("Give the second number to add.");
    	  int input2 = choice.nextInt();
    	  System.out.println("Your result: " +  c.add(input1, input2));

    	  // subtract
      } else if (ch == 2) {
    	  System.out.println("Give the first number to subtract.");
    	  int input1 = choice.nextInt();
    	  System.out.println("Give the second number to subtract from.");
    	  int input2 = choice.nextInt();
    	  System.out.println("Your result: " +  c.sub(input1, input2));

    	  // multiply
      } else if (ch == 3) {
    	  System.out.println("Give the first number to multiply.");
    	  int input1 = choice.nextInt();
    	  System.out.println("Give the second number to subtract multiply.");
    	  int input2 = choice.nextInt();
    	  System.out.println("Your result: " +  c.multiple(input1, input2));

    	  // divide
      } else if (ch == 4) {
    	  System.out.println("Give the first number to divide.");
    	  int input1 = choice.nextInt();
    	  System.out.println("Give the second number to divide by.");
    	  int input2 = choice.nextInt();
    	  System.out.println("Your result: " +  c.divide(input1, input2));

    	  // exponent
      } else if (ch == 5) {
    	  System.out.println("Give the base number.");
    	  int input1 = choice.nextInt();
    	  System.out.println("Give the power.");
    	  int input2 = choice.nextInt();
    	  System.out.println("Your result: " + c.exponent(input1, input2));

    	  // factorial
      } else if (ch == 6) {
    	  System.out.println("Give the base number.");
    	  int input1 = choice.nextInt();
    	  System.out.println("Your result: " + c.factorial(input1));

    	  // average
      } else if (ch == 7) {
    	  System.out.println("Give the first number. ");
    	  int input1 = choice.nextInt();
    	  System.out.println("Give the second number. ");
    	  int input2 = choice.nextInt();
    	  System.out.println("Give the third number. ");
    	  int input3 = choice.nextInt();
    	  System.out.println("Your result: " + c.average(input1, input2, input3));

    	  // median
      } else if (ch == 8) {
    	  System.out.println("Give the first number. ");
    	  int input1 = choice.nextInt();
    	  System.out.println("Give the second number. ");
    	  int input2 = choice.nextInt();
    	  System.out.println("Give the third number. ");
    	  int input3 = choice.nextInt();
    	  System.out.println("Your result: " + c.median(input1, input2, input3));

    	  // min
      } else if (ch == 9) {
    	  System.out.println("Give the first number. ");
    	  int input1 = choice.nextInt();
    	  System.out.println("Give the second number. ");
    	  int input2 = choice.nextInt();
    	  System.out.println("Give the third number. ");
    	  int input3 = choice.nextInt();
    	  System.out.println("Your result: " + c.minimum(input1, input2, input3));

    	  // max
      } else if (ch == 10) {
    	  System.out.println("Give the first number. ");
    	  int input1 = choice.nextInt();
    	  System.out.println("Give the second number. ");
    	  int input2 = choice.nextInt();
    	  System.out.println("Give the third number. ");
    	  int input3 = choice.nextInt();
    	  System.out.println("Your result: " + c.maximum(input1, input2, input3));

    	  // percent
      } else if (ch == 11) {
    	  System.out.println("Give the first number.");
    	  int input1 = choice.nextInt();
    	  System.out.println("Give the second number.");
    	  int input2 = choice.nextInt();
    	  System.out.println("Your result: " +  c.percentChange(input1, input2) + "%");
      }

      System.out.println("Would you like to calculate another thing?");
      System.out.println("\t 1. Yes");
      System.out.println("\t 2. No");
      int answer = choice.nextInt();
// nextInt is system read as an integer
      // To quit
      if (answer == 2) {
    	  break;
      } else if (answer == 1) {;
      }

    }
  }
}
