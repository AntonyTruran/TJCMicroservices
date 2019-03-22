package com.qa.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.demo.entities.Account;
import com.qa.repository.MongoAccountRepo;

@Component
public class AccountReceiver {


    @Autowired
    private MongoAccountRepo repo;

    @JmsListener(destination = "Jimmy is a weapon")
    public void receiveMessage(Account account) {
        repo.save(account);
    }
}
