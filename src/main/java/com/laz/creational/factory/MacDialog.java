package com.laz.creational.factory;

import com.laz.creational.factory.buttons.Button;
import com.laz.creational.factory.buttons.MacButton;

/*
 Concrete factory implementation
*/
public class MacDialog extends Dialog {

  @Override
  public Button createButton() {
    return new MacButton();
  }
}
