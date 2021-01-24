package org.springboot.webapp.bankapplication.controllers;

import org.springboot.webapp.bankapplication.models.CreditEligibility;
import org.springboot.webapp.bankapplication.services.CreditEligibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class CreditEligibilityController {

    @Autowired
    private CreditEligibilityService creditEligibilityService;

    @GetMapping("/creditEligibility")
    public List<CreditEligibility> creditEligibility(){
        List<CreditEligibility> creditEligibility = creditEligibilityService.GetCreditEligibility();
        return creditEligibility;

    }

    @GetMapping("/creditEligibility/{userId}")
    public List<CreditEligibility> creditEligibility(@PathVariable (value = "userId") Long UserId){
        List<CreditEligibility> creditEligibility = creditEligibilityService.GetCreditEligibility();
        return creditEligibility;
    }
}
