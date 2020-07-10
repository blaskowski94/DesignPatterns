package com.laz.abstractfactory;

import com.laz.abstractfactory.buttons.Button;
import com.laz.abstractfactory.buttons.HtmlButton;
import com.laz.abstractfactory.checkboxes.Checkbox;
import com.laz.abstractfactory.checkboxes.HtmlCheckbox;

/*
Concrete implementation of factory.
*/
public class HtmlFactory implements GUIFactory {

  @Override
  public Button createButton() {
    return new HtmlButton();
  }

  @Override
  public Checkbox createCheckbox() {
    return new HtmlCheckbox();
  }
}
