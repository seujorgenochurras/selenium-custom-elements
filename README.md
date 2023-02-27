# selenium-custom-elements
This is a library for creating your own custom elements in java selenium.

### What does it provide?
It provides a way to easily create your own custom HTML elements adding also adding
support for those elements inside the html iframe tag (#document).

### How do I create my own element?
That's easy, just make a class that extends the ``CustomElement`` class. <br>
If you want to define an element that is inside the Iframe, you need to extend the ``DocumentElement`` class.
<br>Also, there are some cool functions on the ``DocumentUtils`` class that you might want to check out.
