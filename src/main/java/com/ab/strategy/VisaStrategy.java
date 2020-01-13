package com.ab.strategy;

public class VisaStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        boolean isValid = false;

        isValid = creditCard.getNumber().startsWith("4");

        if(isValid){
            isValid = creditCard.getNumber().length() == 16;
        }
        if(isValid){
            isValid = checkLuhn(creditCard.getNumber());
        }
        return isValid;

    }
}
