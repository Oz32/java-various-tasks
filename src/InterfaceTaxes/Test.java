package InterfaceTaxes;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {

        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(new BigDecimal("1003547357458485685785700.657967909"), new VatTaxType(), taxService),
                new Bill(new BigDecimal("63430946834078039870359753487006.69"), new IncomeTaxType(), taxService),
                new Bill(new BigDecimal("457345200564.834573574357488"), new ProgressiveTaxType(), taxService)
        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}