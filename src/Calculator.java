public class Calculator {

    public int add(int a, int b){
        int result = a+b;
        return result;
    }

    public int sub(int a, int b){
        int result = a-b;
        return result;
    }
}

class CalculatorApplication{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("4+5=" + calculator.add(4,5));
        System.out.println("5-3=" + calculator.sub(5,3));
    }
}




