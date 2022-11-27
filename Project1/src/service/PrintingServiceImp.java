package service;

import calculator.InputData;

public class PrintingServiceImp implements PrintingService{


    @Override
    @SuppressWarnings("StringBufferReplaceableByString")
    public void printingInputDataInfo(InputData inputData) {
        StringBuilder msg = new StringBuilder(NEW_LINE);
        msg.append(MORTGAGE_AMOUNT).append(inputData.getAmount()).append(CURRENCY);
        msg.append(NEW_LINE);
        msg.append(MORTGAGE_PERIOD).append(inputData.getMonthsDuration()).append(MONTHS);
        msg.append(NEW_LINE);
        msg.append(INTEREST).append(inputData.getInterestDisplay()).append(PERCENT);
        msg.append(NEW_LINE);

        printMessage(msg.toString());
    }
    private void printMessage(String sb) {
         System.out.println(sb);
     }

}
