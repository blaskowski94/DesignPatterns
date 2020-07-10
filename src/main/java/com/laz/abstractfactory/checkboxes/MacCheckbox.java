package com.laz.abstractfactory.checkboxes;

public class MacCheckbox implements Checkbox {

  @Override
  public void render() {
    System.out.println("Test Mac checkbox");
    onCheck();
  }

  @Override
  public void onCheck() {
    System.out.println("Check! Mac checkbox says - 'Hello  World!'");
  }
}
