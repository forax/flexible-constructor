// /Library/Java/JavaVirtualMachines/jdk-22.jdk/Contents/Home/bin/javac --enable-preview --source 22 _5_inner_class.java
// /Library/Java/JavaVirtualMachines/jdk-22.jdk/Contents/Home/bin/javap -c -private _5_inner_class\$A\$1.class

static class A {
  A() {
    super();
    this.m();  // ooops !!!
  }
  void m() { }

  static A factory(int value) {
    return new A() {
      @Override void m() {
        System.out.println(value);
      }
    };
  }
}

void main() {
  A.factory(42);
}



// _5_inner_class$A$1(int);
//    Code:
//       0: aload_0
//       1: iload_1
//       2: putfield      #1                  // Field val$value:I
//       5: aload_0
//       6: invokespecial #7                  // Method _6_inner_class$A."<init>":()V
//       9: return
