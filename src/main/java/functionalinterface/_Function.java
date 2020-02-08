package functionalinterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment = increment(10);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(11);
        System.out.println(increment2);

        int multipleBy10Function = multiplyBy10.apply(increment2);
        System.out.println(multipleBy10Function);
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number++;
    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

    static int increment(int number){
        return number+1;
    }
}
