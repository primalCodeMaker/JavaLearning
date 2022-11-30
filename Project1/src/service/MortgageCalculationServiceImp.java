package service;

import calculator.InputData;
import calculator.Rate;

import java.util.List;

public class MortgageCalculationServiceImp implements MortgageCalculationService {

    private final PrintingService printingService;
    private final RateCalculationService rateCalculationService;

    public MortgageCalculationServiceImp(
            PrintingService printingService,
            RateCalculationService rateCalculationService
    ) {
        this.printingService = printingService;
        this.rateCalculationService = rateCalculationService;
    }

    @Override
    public void calculate(InputData inputData) {
        printingService.printingInputDataInfo(inputData);

        List<Rate> rates = rateCalculationService.calculate(inputData);
    }
}
