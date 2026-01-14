package application.usecase;

import domain.model.Payment;
import domain.port.PaymentGatewayPort;

public class ProcessPaymentUseCase {

	private final PaymentGatewayPort gatewayPort;
	
	public ProcessPaymentUseCase(
			final PaymentGatewayPort gatewayPort) {
		this.gatewayPort = gatewayPort;
	}
	
	public void execute(
			final Payment payment) {
		gatewayPort.charge(payment);
	}
	
}
