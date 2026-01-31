package com.arup.ecommerce.kafka;

import com.arup.ecommerce.customer.CustomerResponse;
import com.arup.ecommerce.order.PaymentMethod;
import com.arup.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}

