static class Utils {
  public static int computeHash(String name) {
    return name.hashCode();
  }
}

static class Hashed {
  int hash;
  Hashed(int hash) {
    this.hash = hash;
  }
}
static class Sausage extends Hashed {
  String name;
  Sausage(String name) {
    //int hash = Utils.computeHash(name);
    //super(hash);
    super(Utils.computeHash(name));
    this.name = name;
  }
}

void main() {
  var sausage = new Sausage("Lyon");
  System.out.println(sausage.hash);
}
