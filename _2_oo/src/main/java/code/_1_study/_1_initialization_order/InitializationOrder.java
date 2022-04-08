package code._1_study._1_initialization_order;

public class InitializationOrder {
  public static void main(String[] args) {
    //Parent parent = new Parent();
    Child c = new Child();

  }
}

class Parent {
  {
    System.out.println("parent regular init block");
  }

  static {
    System.out.println("parent static init block");
  }

  public Parent() {
    System.out.println("parent constructor");
    //lalala
  }
}

class Child extends Parent {
  {
    System.out.println("child  regular init block");
  }

  static {
    System.out.println("child  static init block ");
  }

  public Child() {
    System.out.println("child  constructor");
  }
}
