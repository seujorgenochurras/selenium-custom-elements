package org.jhey.custom.element;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This class only provides custom methods for elements
 * */
public abstract class CustomElement extends Element {
   protected CustomElement(WebElement webElement, WebDriver webDriver) {
      super(webElement, webDriver);
   }

   public abstract String getXpath();

   public WebElement toWebElement(){
      return this.webElement;
   }
}
