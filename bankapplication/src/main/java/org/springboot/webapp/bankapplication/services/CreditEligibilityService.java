package org.springboot.webapp.bankapplication.services;

import org.springboot.webapp.bankapplication.models.CreditEligibility;
import org.springframework.stereotype.Service;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class CreditEligibilityService {


    public List<CreditEligibility> GetCreditEligibility(){

        double creditAmount = 0;
        String creditEligibility = "false";
        DecimalFormat df = new DecimalFormat("0.00");

        int numOfUsers = 4;

        List<List<Integer>> usersTransactions = new ArrayList<List<Integer>>();
        for (int i = 0; i < numOfUsers; i++) {
            List<Integer> transactionsOfUser = new ArrayList<>();
            usersTransactions.add(transactionsOfUser);
        }


        int accountBalance = (int) (50 + (Math.random() * 500));

        int transactionAmount = (int) ((Math.random() * 1500));
        if(accountBalance < transactionAmount){
            creditEligibility = "false";
        }
        else{
            creditEligibility = "true";
        }

        double riskScore = Math.random() * 1;
        double agePoints = Math.random() * 1;

        creditAmount = accountBalance * riskScore * agePoints;
        df.setRoundingMode(RoundingMode.UP);

        CreditEligibility creditEligibilityStatusUser1 = new CreditEligibility(df.format(creditAmount), creditEligibility);
        CreditEligibility creditEligibilityStatusUser2 = new CreditEligibility(df.format(creditAmount), creditEligibility);
        CreditEligibility creditEligibilityStatusUser3 = new CreditEligibility(df.format(creditAmount), creditEligibility);
        CreditEligibility creditEligibilityStatusUser4 = new CreditEligibility(df.format(creditAmount), creditEligibility);

        List<CreditEligibility> creditEligibilty = new ArrayList<>();
        creditEligibilty.add(creditEligibilityStatusUser1);
        creditEligibilty.add(creditEligibilityStatusUser2);
        creditEligibilty.add(creditEligibilityStatusUser3);
        creditEligibilty.add(creditEligibilityStatusUser4);

        return creditEligibilty;

    }

}
