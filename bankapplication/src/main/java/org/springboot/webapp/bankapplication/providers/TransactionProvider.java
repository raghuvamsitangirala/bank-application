package org.springboot.webapp.bankapplication.providers;

import org.springboot.webapp.bankapplication.models.Transaction;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class TransactionProvider {
    private static final String transactionServiceUrlHost = "https://localhost:15500";
    public List<Transaction> getUserTransactions(String userId)
    {
        String transactionsUrl = transactionServiceUrlHost+"/api/v2/transactions";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Transaction>> responseEntity = restTemplate.exchange(
                transactionsUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });

        List<Transaction> transactions = responseEntity.getBody();
        return transactions;

    }
}
