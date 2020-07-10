package com.laz.creational.factory;

import com.laz.creational.factory.buttons.Button;
import com.laz.creational.factory.buttons.HtmlButton;

/*
 Concrete factory implementation
*/
public class HtmlDialog extends Dialog {

  @Override
  public Button createButton() {
    return new HtmlButton();
  }
}
