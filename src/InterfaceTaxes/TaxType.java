package InterfaceTaxes;

import java.math.BigDecimal;

interface TaxType {
    public BigDecimal calculateTaxFor(BigDecimal amount);
}
