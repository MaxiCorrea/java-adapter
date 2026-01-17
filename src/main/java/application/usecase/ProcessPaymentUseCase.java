package application.usecase;

import application.port.PaymentGatewayPort;
import domain.model.Payment;

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
