package org.banktransaction.transactionapplication.services;


import org.banktransaction.transactionapplication.models.Transaction;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    public List<Transaction> GetTransactions(){

        Transaction transaction1 = new Transaction("1234", "2000", "25-05-2015");
        Transaction transaction2 = new Transaction("1234", "2000", "25-05-2015");
        Transaction transaction3 = new Transaction("1234", "2000", "25-05-2015");
        Transaction transaction4 = new Transaction("1234", "2000", "25-05-2015");

        List<Transaction> transactionsList = new ArrayList<>();

        transactionsList.add(transaction1);
        transactionsList.add(transaction2);
        transactionsList.add(transaction3);
        transactionsList.add(transaction4);

        return  transactionsList;
    }

}
