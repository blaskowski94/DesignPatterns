package com.laz.creational.abstractfactory;

import com.laz.creational.abstractfactory.buttons.Button;
import com.laz.creational.abstractfactory.checkboxes.Checkbox;

/*
Abstract factory class that declares create methods for each product that return interface product
types.
*/
public interface GUIFactory {

  Button createButton();

  Checkbox createCheckbox();
}
