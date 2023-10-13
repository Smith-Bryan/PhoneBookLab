package pluralsightwork.tdd;

public class Calculator {

    public double add(double x, double y){

        return x+y;
    }

    public int subtract(int a, int b){

        return a - b;
    }

    public int divide(int j, int k){

        return j/k;
    }

    public int exponents(int a, int b){


        return (int) Math.pow(a,b);
    }

    //Write a testcase fot this method
    //Double checkIfParameterIsNull(Double number) { }
    public Double checkIfParameterIsNull(Double number){
        if(number !=  null){
    return number;
        }
        return null;
    }
    public boolean isGreater(int x, int y){
        if(x > y){ }
        return false;
    }

    public int[] multiplyArrayElementsByNumberGiven(int[] array, int number){

        return array;
    }
    //RED
    //GREEN
    //REFACTOR
}
