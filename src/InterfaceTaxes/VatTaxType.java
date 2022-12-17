package InterfaceTaxes;

import java.math.BigDecimal;

public class VatTaxType implements TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return amount.multiply(new BigDecimal("0.18"));
    }
}
