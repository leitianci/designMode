package experiment4;

public class Investor implements InvestorInterface{

    private String name;
    private Stock stock;

    public Investor(String name) {
        this.name = name;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Stock getStock() {
        return stock;
    }

    @Override
    public void update(Stock stock) {
        System.out.println(name + " " + stock.symbol + " " + stock.price);
    }
}
