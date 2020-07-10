package com.laz.creational.abstractfactory;

import com.laz.creational.abstractfactory.buttons.Button;
import com.laz.creational.abstractfactory.buttons.MacButton;
import com.laz.creational.abstractfactory.checkboxes.Checkbox;
import com.laz.creational.abstractfactory.checkboxes.MacCheckbox;

/*
Concrete implementation of factory.
*/
public class MacFactory implements GUIFactory {

  @Override
  public Button createButton() {
    return new MacButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new MacCheckbox();
  }
}
