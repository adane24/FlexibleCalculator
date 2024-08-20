# FlexibleCalculator
New operators can be added directly to Operation enum. The actual calculation delegated 
to OperationStrategy. 

Example 
Add additional operators in Calculator.java
```java
MODULUS((num1, num2) -> num1.doubleValue() % num2.doubleValue()) ;
EXPONENT((num1, num2) -> Math.pow(num1.doubleValue() , num2.doubleValue()) ;

```
