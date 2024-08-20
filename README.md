# FlexibleCalculator
New operators can be added directly to Operation enum. The actual calculation delegated 
to OperationStrategy. This way for future modifications Calculator class remains unchanged.
* Chaining Functionality : see Calculator.chainCalculateda

Example: 
* Add additional operators in Calculator.java
```java
MODULUS((num1, num2) -> num1.doubleValue() % num2.doubleValue()) ;
EXPONENT((num1, num2) -> Math.pow(num1.doubleValue() , num2.doubleValue()) ;

```
