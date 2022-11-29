package service;

import calculator.InputData;

public interface PrintingService {

    String INTEREST_SUM = "SUMA ODSETEK: ";
    String RETE_NUMBER = "NR: ";
    String YEAR = "ROK: ";
    String MONTH = "MIESIAC: ";
    String DATE = "DATA: ";
    String MONTHS = " MIESIECY";
    String RATE = "RATA: ";
    String INTEREST = "OPROCENTOWANIE: ";
    String CAPITAL = "KAPITAL: ";
    String LEFT = "POZOSTALO ";
    String MORTGAGE_AMOUNT = "KWOTA KREDYTU: ";
    String MORTGAGE_PERIOD = "OKRES KREDYTOWANIA: ";

    String CURRENCY = " ZL" ;
    String NEW_LINE = "\n";
    String PERCENT = "% ";

    public abstract void printingInputDataInfo(InputData inputData);
}
