package TaxCountTest;

public class Test {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(106000.09, new VatTaxType(), taxService),
                new Bill(634906.69, new IncomeTaxType(), taxService),
                new Bill(2006564.88, new ProgressiveTaxType(), taxService)
        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}