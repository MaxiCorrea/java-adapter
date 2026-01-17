package application.port;

import domain.model.Payment;

public interface PaymentGatewayPort {

	void charge(Payment payment);
	
}
