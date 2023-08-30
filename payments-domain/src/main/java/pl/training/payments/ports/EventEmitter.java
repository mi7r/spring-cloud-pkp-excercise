package pl.training.payments.ports;

import pl.training.payments.domain.PaymentUpdateEvent;

public interface EventEmitter {

    void performPayment(PaymentUpdateEvent event);

}
