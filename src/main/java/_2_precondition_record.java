import java.util.Objects;

record Student(String name) {
  Student(String name) {
    Objects.requireNonNull(name);
    //super();   // <---
    this.name = name;
  }

  Student() {
    System.out.println("John !");
    this("John");
  }
}

void main() {
  var goodStudent = new Student("Jane");
  //var badStudent = new Student(null);
  var anotherStudent = new Student();
}
