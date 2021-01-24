package org.banktransaction.transactionapplication.controllers;

import org.banktransaction.transactionapplication.models.Transaction;
import org.banktransaction.transactionapplication.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/transactions")
    public List<Transaction> getAllTransactions(){

        List<Transaction> transactions= transactionService.GetTransactions();
        return transactions;
    }

}
