package com.laz.factory;

import com.laz.factory.buttons.Button;
import com.laz.factory.buttons.HtmlButton;

/*
  Concrete factory implementation
 */
public class HtmlDialog extends Dialog {

  @Override
  public Button createButton() {
    return new HtmlButton();
  }
}
