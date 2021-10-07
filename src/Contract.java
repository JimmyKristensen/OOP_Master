public class Contract{
    private int contractId;
    private int price;
    private String contract;
    private Band band;


    public Contract(int contractId, int price, String contract, Band band) {
        this.contractId = contractId;
        this.price = price;
        this.contract = contract;
        this.band = band;
    }


    @Override
    public String toString() {
        return "Contract{" +
                "contractId=" + contractId +
                ", price=" + price +
                ", contract='" + contract + '\'' +
                ", band=" + band +
                '}';
    }
}
