package com.woniu.housemanager.service;

import com.woniu.housemanager.pojo.Debt;

public interface DebtService {
    void insert(Debt d);

    Debt selectBydebtname(String debtname);

    void updateDyqr(Debt debt);
}
