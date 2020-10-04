class Person {
  public static int count = 0;
  public String firstName;
  public String middleName;
  public String lastName;
  public int age;
  public double height, weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    Person.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
    // this()を用いて、コンストラクタを呼び出してください
    this(firstName, lastName, age, height, weight);
    this.middleName = middleName;
  }

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }

  public static void printCount() {
    System.out.println("合計" + Person.count + "人です");
  }
}
// クラスフィールド [START] ========================================
// 何人分のインスタンスを生成したか数えるために、countというフィールドで、インスタンスの生成回数を保存するようにしてみます。countは個々のインスタンスが持つものではなく、Personクラスが持っていればよいので、クラスフィールドにしてあげましょう。
//フィールドに初期値を設定する
// フィールドには、定義時に初期値を設定しておくことができます。
// countはインスタンスの生成回数なので、下図のように定義時に0を代入しておきましょう。
// クラスフィールド [END] ==========================================
