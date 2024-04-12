// /Library/Java/JavaVirtualMachines/jdk-22.jdk/Contents/Home/bin/javac --enable-preview --source 22 _2_precondition_record.java
// /Library/Java/JavaVirtualMachines/jdk-22.jdk/Contents/Home/bin/javap -c -private _2_precondition_record\$Student.class

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



//  _2_precondition_record$Student();
//    Code:
//       0: getstatic     #19                 // Field java/lang/System.out:Ljava/io/PrintStream;
//       3: ldc           #25                 // String John !
//       5: invokevirtual #27                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//       8: aload_0
//       9: ldc           #33                 // String John
//      11: invokespecial #35                 // Method "<init>":(Ljava/lang/String;)V
//      14: return

//  _2_precondition_record$Student(java.lang.String);
//    Code:
//       0: aload_0
//       1: invokespecial #1                  // Method java/lang/Record."<init>":()V
//       4: aload_1
//       5: invokestatic  #7                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
//       8: pop
//       9: aload_0
//      10: aload_1
//      11: putfield      #13                 // Field name:Ljava/lang/String;
//      14: return
