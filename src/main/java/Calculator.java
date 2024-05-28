public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (a != 0 && b != 0){
            return a / b;
        }
        return 0;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(int a, int b){
        // уравнение имеет вид a/b+a*b
        return add(div(a, b), times(a, b));
    }
}
