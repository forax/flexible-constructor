static class A {
  A() {
    super();
    this.m();  // ooops !!!
  }
  void m() { }
}

static class B extends A {
  int value;
  B(int value) {
    //this.value = value;  <!--
    super();
    this.value = value;
  }
  @Override void m() {
    System.out.println(value);
  }
}

void main() {
  new B(42);
}
