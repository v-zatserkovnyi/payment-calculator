package com.example.qa;

public class PaymentCalculator {

    /**
     * Calculates the final amount a customer needs to pay after applying a discount.
     *
     * @param originalAmount The original total amount before discount
     * @param discountRate The discount rate in percentage (e.g., 15 for 15%)
     * @return The amount after discount
     * @throws IllegalArgumentException if originalAmount is negative or discountRate is out of bounds (0-100)
     */
    public double calculateDiscount(double originalAmount, double discountRate) {
        if (discountRate < 0 || discountRate > 100) {
            throw new IllegalArgumentException("Discount rate must be between 0 and 100");
        }

        double discount = (discountRate / 100) * originalAmount;
        double finalAmount = originalAmount - discount;

        return finalAmount;
    }
}
