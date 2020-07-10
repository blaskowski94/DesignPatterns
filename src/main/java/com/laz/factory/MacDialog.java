package com.laz.factory;

import com.laz.factory.buttons.Button;
import com.laz.factory.buttons.MacButton;

/*
 Concrete factory implementation
*/
public class MacDialog extends Dialog {

  @Override
  public Button createButton() {
    return new MacButton();
  }
}
