package Fidessa.ValidPair;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    /**
     * Generic mathematics utility
     *
     * @param <T>
     *            Type upon which to perform math
     */
    public static class Maths<T extends Object> {

        /**
         * Generic interface describing addition
         *
         * @param <T>
         *            Type upon which adding is offered
         */
        public interface Adder<T extends Object> {
            public T add(T a, T b);
        }

        Adder<T> adder;

        public Maths(Adder<T> adder) {
            this.adder = adder;
        }

        /**
         * Calculate the arithmetic sum (addition) of all the items
         * 
         * @param items
         * @return sum of items
         */
        public T sum(List<T> items) {
            if (items.size() < 1)
                return null;
            if (items.size() == 1)
                return items.get(0);

            T retVal = adder.add(items.get(0), items.get(1));
            for (int i = 2; i < items.size(); i++) {
                retVal = adder.add(retVal, items.get(i));
            }

            return retVal;
        }
    }
    /**
     * Allocate a new Maths instance of generic param Integer.
     * 
     * @return integer capable Maths instance
     */
    private static Maths<Integer> createIntMaths() {
        // fill out this method
        
        Maths<Integer> maths=new Maths<Integer>(new Maths.Adder<Integer>(){
            @Override
            public Integer add(Integer a, Integer b){
                return new Integer(a+b);
            }});
           
        return maths;
    }
    
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            Maths<Integer> intMath = createIntMaths();

            while (true) {
                int nextInt = scanner.nextInt();
                System.out.format("%d\n",
                    intMath.sum(Arrays.asList(nextInt, nextInt)));
            }
        } catch (NoSuchElementException e) {
            // no action, EOF
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}