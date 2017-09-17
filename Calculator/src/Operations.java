/**
 * Operations.java
 * @author Ashlee Daniel
 *
 * This is the class for the operations that will be called in the main class, Calc.
 *
 * Operations just has all the functions that are used in the calculator: Addition, subtraction, multiplication,
 * division, and exponents. Plus, I guess, since it's a calculator, parenthesis.
 */

import com.sun.xml.internal.bind.v2.TODO;

import java.math.*;

public class Operations {

    /**
     *  A basic addition function.
     * @param a value to be added
     * @param b value to be added
     * @return the sum of a and b.
     */
    public int addition(int a, int b){
        return a + b;
    }

    /**
     * A subtraction method that uses addition. Don't read too much into this.
     * @param a value to be added
     * @param b value to be added
     * @return the sum of a and b.
     */
    public BigDecimal subtraction(BigDecimal a, BigDecimal b){
        return a.add(negate(b));
    }

    /**
     * A multiplication method that uses addition.
     * @param a value to be added
     * @param b value to be added
     * @return the sum of repeated additions of a.
     */
    public BigDecimal multiplication(BigDecimal a, BigDecimal b){
        double i = 0;
        BigDecimal result = BigDecimal.ZERO;

        while(i < b.doubleValue()){
            result = result.add(a);
            i++;
        }

        return result;
    }

    /**
     * I'm not sure how to accurately describe what I did in here but it's a division method that uses addition,
     * yep. Deffo.
     * @param a value to be added
     * @param b value to be added
     * @return A string that has the result of division a/b
     */
    public String division(BigDecimal a, BigDecimal b){

        if( b == BigDecimal.ZERO){
            // TODO: This should  throw an exception but disregard that for right now.
            return BigDecimal.ZERO.toString();
        }
        else
        {
          int i = 0;
          BigDecimal remainder = b;
          BigDecimal result;
          BigDecimal subtract = a.doubleValue() < 0?  a : negate(a);

          while(remainder.doubleValue() < abs(subtract).doubleValue()){
              remainder = remainder.add(subtract);
              i++;
          }

          result = new BigDecimal(i);

          return result.toString() + " " + remainToFract(a, remainder);
        }
    }

    /**
     * A string method that returns a fraction.
     * @param a the denominator
     * @param remainder the numerator
     * @return a string fraction.
     */
    public String remainToFract(BigDecimal a, BigDecimal remainder){
        return remainder.toString() + "/" + a.toString();
    }

    /**
     * An exponent method that uses multiplcation. But the multiplcation uses addition. So in the end, it's addition.
     * Don't worry about it.
     * @param a A base
     * @param b An exponent
     * @return It's an evaluation of a^b.
     */
    public BigDecimal exponent(BigDecimal a, BigDecimal b){
        BigDecimal result = BigDecimal.ONE;

        for (int i = 0; i < b.intValue(); i++){
            result = multiplication(result, a);
        }

        return result;
    }


    /**
     *
     * Subtraction is adding negative numbers. This method takes any number that
     * is being subtratcted and creates a negative number out of it.
     *
     * @param a The value to be negated
     * @return a negative value of a.
     */
    public BigDecimal negate(BigDecimal a){
        //Use the lowest negative value, Int.Min_Value (2^-31)
        BigDecimal min = new BigDecimal(Integer.MIN_VALUE);
        /* Adding 1 to the min until min plus the value a == 0. */
        while( min.add(a) != BigDecimal.ZERO){
            min = min.add(BigDecimal.ONE);
        }
        return min;
    }

    /**
     *
     * Absolute value function because it's a prohibited unary operator.
     *
     * @param a
     * @return absolute value of a.
     */
    public BigDecimal abs(BigDecimal a){
        return a.doubleValue() > 0?  a : negate(a);
    }

}
