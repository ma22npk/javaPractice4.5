class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();

    Person person2 = new Person("John", "Smith", 65, 1.75, 80.0);
    person2.printData();

    // 「合計◯◯人です」と出力してください
    System.out.println("合計" + Person.count + "人です");
  }
}
