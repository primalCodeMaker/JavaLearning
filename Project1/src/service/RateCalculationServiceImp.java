package service;

import calculator.InputData;
import calculator.Rate;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class RateCalculationServiceImp implements RateCalculationService {

    @Override
    public List<Rate> calculate(InputData inputData) {
        List<Rate> rates = new LinkedList<>();

        BigDecimal rateNumber = BigDecimal.ONE;

        Rate firstRate = calculateFirstRate(rateNumber, inputData);
        rates.add(firstRate);

        Rate preciousRate = firstRate;

        for (BigDecimal index = rateNumber. add(BigDecimal.ONE);
             index.compareTo(inputData.getMonthsDuration()) <= 0;
             index = index.add(BigDecimal.ONE)
        ) {
            Rate nextRate = calculateNextRate();
            rates.add(nextRate);
            preciousRate = nextRate;
        }
        return rates;
    }

    private Rate calculateFirstRate(BigDecimal rateNumber, InputData inputData) {
        return null;
    }

    private Rate calculateNextRate() {
        return null;
    }
}

