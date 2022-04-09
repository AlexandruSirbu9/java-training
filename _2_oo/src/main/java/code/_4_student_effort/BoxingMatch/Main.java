package code._4_student_effort.BoxingMatch;

public class Main {
  public static void main(String[] args) {
    Fighter f1 = new Fighter("Ion" , 10 , 100);
    Fighter f2 = new Fighter("Robert" , 12 , 100);

    Box box = new Box(f1 , f2);
    String w = box.fight();
    System.out.println(w);

  }


}
