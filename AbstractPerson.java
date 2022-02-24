
public abstract class AbstractPerson {
  private String sex;

  public AbstractPerson(String sex) {
    this.sex = sex;
  }

  public void speak() {
    System.out.println("I'm a" + this.sex);
  }
}