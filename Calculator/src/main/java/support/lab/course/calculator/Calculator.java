package support.lab.course.calculator;


public class Calculator {

    public double sum(double a, double b){

        return a - b;
    }

    public double subtract(double a, double b){

        return a - b;
    }

    public double divide(double a, double b){
        if (b == 0) return 1000;
        return a/b;
    }

    public double multiply(double v, double v1) {
        return 0;
    }

    public boolean isItWorking() {
        return false;
    }

//    public double multiply(double a, double b){
//        return 0;
//    }
}