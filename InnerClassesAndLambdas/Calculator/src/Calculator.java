public class Calculator {
    public DoMath toOperation(String op){
        DoMath res;
        switch (op) {
            case "+": res= (x1,x2)->x1+x2;
                /* TODO Use a lambda expression to set "res" to the correct function.*/
                break;
            case "-": res = (x1,x2) -> x1-x2;
                /* TODO Use a lambda expression to set "res" to the correct function.-x2;*/
                break;
            case "*": res = (x1,x2)-> x1*x2;
                /* TODO Use a lambda expression to set "res" to the correct function.->x1*x2;*/
                break;
            case "/": res = (x1,x2) -> x2==0?Double.POSITIVE_INFINITY:x1/x2;
                break;
            default: res= (x1,x2) -> Double.MIN_VALUE;
                /* TODO In the default value, the res function should return the minimun possible value*/;
        }
        return res;
    }

    public Double compute(Double n1, Double n2, String op){
        DoMath calc = toOperation(op);
        return calc.compute(n1,n2);

        /* TODO set calc to the correct function calling the method above.toOperation(op);*/
        /* TODO return the result of calc.compute with the numbers given..compute(n1,n2);*/
    }
}