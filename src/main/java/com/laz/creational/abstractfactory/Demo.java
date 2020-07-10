package com.laz.creational.abstractfactory;

/*
Configure client code at startup based on environment and instantiate the concrete factory.
*/
public class Demo {
  private static Application configureApplication() {
    Application app;
    GUIFactory factory;
    String osName = System.getProperty("os.name").toLowerCase();
    if (osName.contains("mac")) {
      factory = new MacFactory();
    } else {
      factory = new HtmlFactory();
    }
    app = new Application(factory);
    return app;
  }

  public static void main(String[] args) {
    Application app = configureApplication();
    app.paint();
  }
}
