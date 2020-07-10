package com.laz.abstractfactory;

import com.laz.abstractfactory.buttons.Button;
import com.laz.abstractfactory.buttons.MacButton;
import com.laz.abstractfactory.checkboxes.Checkbox;
import com.laz.abstractfactory.checkboxes.MacCheckbox;

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
