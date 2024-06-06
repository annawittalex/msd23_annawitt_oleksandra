# Calculator Test Cases

The test cases cover various scenarios to ensure that the `add`, `minus`, `divide`, and `multiply` methods in the `Calculator` class function correctly, including handling negative numbers and special cases such as division by zero.


## `add` Method

### Positive Numbers
- **Test Case:** `calc.add(2, 3)`
- **Expected Result:** `5`

### Negative and Positive Number
- **Test Case:** `calc.add(-5, 6)`
- **Expected Result:** `1`

### Negative Numbers
- **Test Case:** `calc.add(-5, -2)`
- **Expected Result:** `-7`

## `minus` Method

### Positive Numbers
- **Test Case:** `calc.minus(5, 3)`
- **Expected Result:** `2`

### Negative Numbers
- **Test Case:** `calc.minus(-5, -2)`
- **Expected Result:** `-3`

### Negative and Positive Number
- **Test Case:** `calc.minus(-4, 3)`
- **Expected Result:** `-7`

## `divide` Method

### Positive Numbers
- **Test Case:** `calc.divide(12, 3)`
- **Expected Result:** `4`

### Negative and Positive Number
- **Test Case:** `calc.divide(-10, 2)`
- **Expected Result:** `-5`

### Division by Zero
- **Test Case:** `calc.divide(10, 0)`
- **Expected Result:** `ArithmeticException` (this test case checks if the method throws an exception)

## `multiply` Method

### Positive Numbers
- **Test Case:** `calc.multiply(2, 3)`
- **Expected Result:** `6`

### Negative and Positive Number
- **Test Case:** `calc.multiply(-2, 3)`
- **Expected Result:** `-6`

### Negative Numbers
- **Test Case:** `calc.multiply(-2, -4)`
- **Expected Result:** `8`