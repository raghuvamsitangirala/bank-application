package org.springboot.webapp.bankapplication.models;

public class CreditEligibility {
    private String creditAmount;
    private String creditEligibility;

    public CreditEligibility(String creditAmount, String creditEligibility) {
        this.creditAmount = creditAmount;
        this.creditEligibility = creditEligibility;
    }

    public String getCreditEligibility() {
        return creditEligibility;
    }

    public void setCreditEligibility(String creditEligibility) {
        this.creditEligibility = creditEligibility;
    }

    public String getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
    }
}
