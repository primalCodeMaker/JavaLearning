package service;

import calculator.InputData;
import calculator.Rate;

import java.util.List;

public interface RateCalculationService {

    List<Rate> calculate(final InputData inputData);
}
