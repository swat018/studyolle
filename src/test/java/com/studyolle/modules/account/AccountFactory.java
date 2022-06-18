package com.studyolle.modules.account;

import lombok.RequiredArgsConstructor;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountFactory {

    @Autowired
    AccountRepository accountRepository;

    public Account createAccount(String nickname) {
        Account jinwoo = new Account();
        jinwoo.setNickname(nickname);
        jinwoo.setEmail(nickname + "@email.com");
        accountRepository.save(jinwoo);
        return jinwoo;
    }

}
