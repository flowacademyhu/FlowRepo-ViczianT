public enum SomeEnum {

  _1 {
    @Override
    public void doSomething() {
      System.out.println("One");
    }
  }, _2 {
    @Override
    public void doSomething() {
      System.out.println("Two");
    }
  }, _3 {
    @Override
    public void doSomething() {
      System.out.println("Three");
    }
  }, DEFAULT {
    @Override
    public void doSomething() {
      System.out.println("Many");
    }
  };

  public abstract void doSomething();

  public static SomeEnum parse(int num) {
    if (num < 1 || num > 3) {
      return DEFAULT;
    }
    return SomeEnum.valueOf("_" + num);
  }

}
