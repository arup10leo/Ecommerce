package com.arup.ecommerce.payment;

import com.arup.ecommerce.customer.CustomerResponse;
import com.arup.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}

