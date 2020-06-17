package com.woniu.housemanager.service;

import java.util.List;

public interface DevisionService {
    List findAll();

    List findAllByarename(String arename);
}
