public class ConcurrencyRunnerEx {
    public static void main(String[] args) {
        ConcurrencyEx concurrencyEx=new ConcurrencyEx();
        concurrencyEx.incrementI();
        System.out.println(concurrencyEx.getI());
    }
}
