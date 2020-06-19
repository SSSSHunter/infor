package com.woniu.housemanager;



import com.woniu.housemanager.service.UserInfoService;
import com.woniu.housemanager.service.WorkerInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@SpringBootTest
class HousemanagerApplicationTests {
    @Resource
    UserInfoService    userInfoService;
    @Resource
    WorkerInfoService workerInfo;
    @Test
    void contextLoads() {
    }
    @Test
    public void test(){
        List<Object> list= Collections.singletonList(userInfoService.findAll());
        List<Object> list1= Collections.singletonList(workerInfo.findAll());
        list1.addAll(list);
        for (Object o : list1) {
            System.out.println(o);
        }

    }

}
