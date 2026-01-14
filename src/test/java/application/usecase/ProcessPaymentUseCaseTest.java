package application.usecase;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import domain.model.Payment;
import domain.port.PaymentGatewayPort;

class ProcessPaymentUseCaseTest {

	@Test
	void shouldChargePaymentThroughGateway() {
		PaymentGatewayPort port = Mockito.mock(PaymentGatewayPort.class);
		ProcessPaymentUseCase usecase = new ProcessPaymentUseCase(port);
		Payment payment = new Payment("123", BigDecimal.TEN);
		usecase.execute(payment);
		Mockito.verify(port).charge(payment);
		Mockito.verifyNoMoreInteractions(port);
	}

}
