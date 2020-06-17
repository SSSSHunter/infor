package com.woniu.housemanager.service;

import com.woniu.housemanager.pojo.Tree;

import java.util.List;

public interface TreeService {
    List<Tree> findAll();
    void save(Tree tree);
    void deleteById(Integer id);
    void updateTree(Tree tree);
    Tree findById(Integer id);
}
