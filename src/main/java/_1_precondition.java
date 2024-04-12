import java.util.Objects;

static class Named {
  String name;
  Named(String name) {
    this.name = name;
  }
}

static class Student extends Named {
  Student(String name) {
    //Objects.requireNonNull(name);   // <---
    super(name);
    Objects.requireNonNull(name);
  }
}

void main() {
  var goodStudent = new Student("Jane");
  var badStudent = new Student(null);
}
