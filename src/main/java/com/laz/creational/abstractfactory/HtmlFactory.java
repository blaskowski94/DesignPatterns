package com.laz.creational.abstractfactory;

import com.laz.creational.abstractfactory.buttons.Button;
import com.laz.creational.abstractfactory.buttons.HtmlButton;
import com.laz.creational.abstractfactory.checkboxes.Checkbox;
import com.laz.creational.abstractfactory.checkboxes.HtmlCheckbox;

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
