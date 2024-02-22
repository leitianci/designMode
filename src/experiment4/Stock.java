package experiment4;

import java.util.ArrayList;

public abstract class Stock {
    protected String symbol;
    protected double price;
    private ArrayList<Investor> investors = new ArrayList<Investor>();

    public Stock(String symbol,double price){
        super();
        this.symbol = symbol;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void attach(Investor investor){
        investors.add(investor);
    }

    public void detach(Investor investor){
        investors.remove(investor);
    }

    public void Notify(){
        for(Investor i : investors){
            i.update(this);
        }
    }

}
