package calculator;

import java.math.BigDecimal;

public class Rate {

    private final BigDecimal rateNumber;

    private final TimePoint timePoint;

    private final RateAmounts rateAmounts;

    private final MortgageResidual mortgageResidual;

    public Rate(BigDecimal rateNumber, TimePoint timePoint, RateAmounts rateAmounts, MortgageResidual mortgageResidual) {
        this.rateNumber = rateNumber;
        this.timePoint = timePoint;
        this.rateAmounts = rateAmounts;
        this.mortgageResidual = mortgageResidual;
    }

    public BigDecimal getRateNumber() {
        return rateNumber;
    }

    public TimePoint getTimePoint() {
        return timePoint;
    }

    public RateAmounts getRateAmounts() {
        return rateAmounts;
    }

    public MortgageResidual getMortgageResidual() {
        return mortgageResidual;
    }
}
