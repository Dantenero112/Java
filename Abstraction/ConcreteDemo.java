class ConcreteDemo extends AbstractDemo2{
  ConcreteDemo(){
  System.out.println("Constructor of ConcreteDemo class");
  }
  void printer(){
  System.out.println("Printer of Concrete Class");
  }
  void show(){
  System.out.println("Show Method");
  }
  public static AbstractDemo2 getInstance(){
  return new ConcreteDemo();
  }
}
