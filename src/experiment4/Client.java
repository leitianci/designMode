package experiment4;

public class Client {
    public static  void main(String[] args){
        Investor a = new Investor("aaa");
        Investor b = new Investor("bbb");

        IBM ibm = new IBM("IBM",120);
        ibm.attach(a);
        ibm.attach(b);

        ibm.setPrice(120.00);
        ibm.Notify();
        ibm.setPrice(120.70);
        ibm.Notify();
        ibm.setPrice(120.32);
        ibm.Notify();
        ibm.setPrice(120.48);
        ibm.Notify();
    }
}
