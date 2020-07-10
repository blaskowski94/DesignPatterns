package com.laz.factory;

import com.laz.factory.buttons.Button;

/*
 Base factory class with abstract method for creating product with common product interface return
 type. Would normally have other business logic here that we want shared regardless of what type of
 product is created. Factory is just one role for this class
*/
public abstract class Dialog {

  public void renderWindow() {
    Button okButton = createButton();
    okButton.render();
  }

  public abstract Button createButton();
}
