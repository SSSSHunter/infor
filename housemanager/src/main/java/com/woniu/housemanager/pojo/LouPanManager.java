package com.woniu.housemanager.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LouPanManager implements Serializable {
    private String projectname;
    private String loupanmanager;
    private Integer diid;
    private Integer buildingid;
    private Integer pspid;
    private String loupanstatus;
    private String presalepermitcode;
}