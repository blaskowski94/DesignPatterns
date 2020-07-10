package com.laz.abstractfactory.checkboxes;

public class HtmlCheckbox implements Checkbox {

  @Override
  public void render() {
    System.out.println("<checkbox>Test checkbox</checkbox");
    onCheck();
  }

  @Override
  public void onCheck() {
    System.out.println("Check! HTML Checkbox says - 'Hello  World!'");
  }
}
