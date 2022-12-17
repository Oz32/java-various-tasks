package TaxCountTest;

public class VatTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        return amount * 0.18;
    }
}
