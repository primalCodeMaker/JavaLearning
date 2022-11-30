package service;

import calculator.*;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class RateCalculationServiceImp implements RateCalculationService {

    private final TimePointService timePointService;

    private final AmountCalculationService amountCalculationService;

    private final ResidualCalculationService residualCalculationService;

    public RateCalculationServiceImp(
            TimePointService timePointService,
            AmountCalculationService amountCalculationService,
            ResidualCalculationService residualCalculationService
    ) {
        this.timePointService = timePointService;
        this.amountCalculationService = amountCalculationService;
        this.residualCalculationService = residualCalculationService;
    }

    @Override
    public List<Rate> calculate(InputData inputData) {
        List<Rate> rates = new LinkedList<>();

        BigDecimal rateNumber = BigDecimal.ONE;

        Rate firstRate = calculateRate(rateNumber, inputData);
        rates.add(firstRate);

        Rate preciousRate = firstRate;

        for (BigDecimal index = rateNumber.add(BigDecimal.ONE);
             index.compareTo(inputData.getMonthsDuration()) <= 0;
             index = index.add(BigDecimal.ONE)
        ) {
            Rate nextRate = calculatRate(index, inputData, preciousRate);
            rates.add(nextRate);
            preciousRate = nextRate;
        }
        return rates;
    }

    private Rate calculateRate(BigDecimal rateNumber, InputData inputData) {
        TimePoint timePoint = timePointService.calculate();
        RateAmounts rateAmounts = amountCalculationService.calculate();
        MortgageResidual mortgageResidual = residualCalculationService.calculate();

        return new Rate(rateNumber, timePoint, rateAmounts, mortgageResidual);
    }

    private Rate calculatRate(BigDecimal rateNumber, InputData inputData, Rate rate) {
        TimePoint timePoint = timePointService.calculate();
        RateAmounts rateAmounts = amountCalculationService.calculate();
        MortgageResidual mortgageResidual = residualCalculationService.calculate();

        return new Rate(rateNumber, timePoint, rateAmounts, mortgageResidual);
    }
}

