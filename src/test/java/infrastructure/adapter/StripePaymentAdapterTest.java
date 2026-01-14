package infrastructure.adapter;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import domain.model.Payment;

class StripePaymentAdapterTest {

	@Test
	void shouldAdaptPaymentToStripeSdk() {
		StripeSdkClient sdk = Mockito.mock(StripeSdkClient.class);
		StripePaymentAdapter adapter = new StripePaymentAdapter(sdk);
		Payment payment = new Payment("123", BigDecimal.TEN);
		adapter.charge(payment);
		Mockito.verify(sdk).makePayment("123", BigDecimal.TEN);
		Mockito.verifyNoMoreInteractions(sdk);
	}

}
