package infrastructure.adapter;

import java.math.BigDecimal;

import domain.model.Payment;
import domain.port.PaymentGatewayPort;

public class StripePaymentAdapter implements PaymentGatewayPort {

	private final StripeSdkClient client;
	
	public StripePaymentAdapter(
			final StripeSdkClient client) {
		this.client = client;
	}
	
	@Override
	public void charge(
			final Payment payment) {
		String description = payment.getReference();
		BigDecimal total = payment.getAmount();
		client.makePayment(description, total);
	}

}
