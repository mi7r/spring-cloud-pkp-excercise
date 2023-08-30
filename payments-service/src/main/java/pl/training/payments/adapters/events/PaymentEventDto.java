package pl.training.payments.adapters.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.training.payments.domain.PaymentStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentEventDto {

    private String type;
    private String currency;
    private String paymentId;
    private String paymentStatus;

}
