package streamApiLambda.com;
interface Cacluator{
    void add(int a, int b);
}
public class ImplementFunctionalInterface {
    public static void main(String args[]){
        //annanoums inner class implemenatiotn of functional interface
        Cacluator cal = new Cacluator() {
            @Override
            public void add(int a, int b) {
                System.out.println(a + b);
            }
        };
        cal.add(12,34);

        //lambda implementation of functional interface
        Cacluator cacluator = (a, b) -> System.out.println(a+b);
        cacluator.add(23,78);
        System.out.println();
    }
}
