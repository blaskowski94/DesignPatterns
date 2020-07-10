package com.laz.abstractfactory;

import com.laz.abstractfactory.buttons.Button;
import com.laz.abstractfactory.checkboxes.Checkbox;

/*
Abstract factory class that declares create methods for each product that return interface product
types.
*/
public interface GUIFactory {

  Button createButton();

  Checkbox createCheckbox();
}
