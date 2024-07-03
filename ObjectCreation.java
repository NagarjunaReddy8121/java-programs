public class ObjectCreation {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;

        Calculator calculator=new Calculator();
        int result=calculator.add(num1,num2);
        System.out.println(result);
    }
}

class Calculator{

    int add(int a,int b){
        int r=a+b;
        return r;
    }
}
