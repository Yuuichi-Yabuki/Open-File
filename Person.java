
public class Person  { 
  
  private String sex;

  public Person(String sex) {
    this.sex = sex;
  }

  public void speak() { 
    System.out.println("I'm a "+ this.sex);
  } 
}