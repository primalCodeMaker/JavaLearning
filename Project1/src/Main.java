import calculator.InputData;
import service.PrintingService;
import service.PrintingServiceImp;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        InputData inputData = new InputData()
                .witwAmount(new BigDecimal("298000"))
                .witwMonthsDuration(BigDecimal.valueOf(160));

        PrintingService printingService = new PrintingServiceImp();
        printingService.printingInputDataInfo(inputData);
    }
}