package designpatterns.state;

public class Demo {
    public static void main(String[] args) {
        Chain chain = new Chain();
        chain.pull();
        chain.pull();
        chain.pull();
        chain.pull();
    }
}
