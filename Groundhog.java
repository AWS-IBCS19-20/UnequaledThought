class Groundhog {
  private String name;
  private Boolean accurate;
  private Integer age;
  private String date;

    public Groundhog() {
      name = "Phil";
      age = 134;
      date = "february3";
      accurate = true;
    }

    public void popUpOnGroundhogDay() {
      System.out.println("Spring is Early");
    }

    public String isWrong() {

      return  "groundhog is wrong";
    }

    public static void main(String[] args) {
      Groundhog g = new Groundhog();
      System.out.println(g.name);
      System.out.println(g.age);
      System.out.println(g.accurate);

      g.popUpOnGroundhogDay();
      System.out.println(g.isWrong());

    }
  }
