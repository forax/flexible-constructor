# Flexible Constructors

Examples of flexible constructors ([JEP 447](https://openjdk.org/jeps/447)) and
the more recent JEP ([Flexible constructors](https://openjdk.org/jeps/8325803)).

### Can have statement before super(...)

```java
class Named {
  String name;
  Named(String name) {
    this.name = name;
  }
}

class Student extends Named {
  Student(String name) {
    Objects.requireNonNull(name);   // before !
    super(name);
  }
}
```

### In the future, can initialize fields before super(...)

```java
class A {
  A() {
    super();
    this.m();  // ooops !!!
  }
  void m() { }
}

class B extends A {
  int value;
  B(int value) {
    this.value = value;  // before !
    super();
  }
  @Override void m() {
    System.out.println(value);
  }
}
```

This second feature is not yet implemented !

## Examples

Check preconditions before super(...)
- [_1_precondition.java](src/main/java/_1_precondition.java)
- [_2_precondition_record.java](src/main/java/_2_precondition_record.java)
- [_3_less_readable.java](src/main/java/_3_less_readable.java)

Initialize field before super(...)
- [_4_this_escape.java](src/main/java/_4_this_escape.java)
- [_5_inner_class.java](src/main/java/_5_inner_class.java)

