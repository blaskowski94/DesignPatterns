package com.laz.factory;

/*
  Sample client code using the factory. Concrete factory implementation is instantiated at run time
  using abstract interface.
 */
public class Demo {
  private static Dialog dialog;

  public static void main(String[] args) {
    configure();
    runBusinessLogic();
  }


  static void configure() {
    if (System.getProperty("os.name").equals("Mac OS X")) {
      dialog = new MacDialog();
    } else {
      dialog = new HtmlDialog();
    }
  }

  static void runBusinessLogic() {
    dialog.renderWindow();
  }
}
