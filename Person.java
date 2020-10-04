class Person {
  public String firstName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  // fullNameメソッドを定義してください
  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  // bmiメソッドを定義してください
  public double bmi() {
    return this.weight / this.height / this.height;
  }
}
