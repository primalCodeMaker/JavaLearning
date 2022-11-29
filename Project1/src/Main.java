import calculator.InputData;
import service.*;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        InputData inputData = new InputData()
                .witwAmount(new BigDecimal("298000"))
                .witwMonthsDuration(BigDecimal.valueOf(160));

        PrintingService printingService = new PrintingServiceImp();
        RateCalculationService rateCalculationService = new RateCalculationServiceImp();

        MortgageCalculationService mortgageCalculationService = new MortgageCalculationServiceImp(
                printingService,
                rateCalculationService
        );
        mortgageCalculationService.calculate(inputData);
    }
}