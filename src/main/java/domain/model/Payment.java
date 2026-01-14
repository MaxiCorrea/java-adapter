package domain.model;

import java.math.BigDecimal;

public class Payment {

	private final String reference;
	private final BigDecimal amount;
	
	public Payment(
			final String reference,
			final BigDecimal amount) {
		this.reference = reference;
		this.amount = amount;
	}
	
	public String getReference() {
		return reference;
	}
	
	public BigDecimal getAmount() {
		return amount;
	}
	
}
