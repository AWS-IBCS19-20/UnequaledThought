class calculator {
  private int int1, int2;
  private int result;
  
    public calculator() {
      int1 = 20;
      int2 = 10;
      result = 0;
    }
    
    public int add () {
    result = int1 + int2;
    return result;
    }
    
    public int sub () {
    result = int1 - int2;
    return result;
    }
    
    public int divide () {
    result = int1 / int2;
    return result;
    }
    
    public int multiple () {
    result = int1 * int2;
    return result;
    }
    
    public static void main(String[] args) {
    calculator c = new calculator();
    System.out.println(int1 +  " + " + int2 + " = " c.add());
    System.out.println(int1 +  " - " + int2 + " = " c.sub());
    System.out.println(int1 +  " / " + int2 + " = " c.divide());
    System.out.println(int1 +  " * " + int2 + " = " c.mutiple());
    }
}
