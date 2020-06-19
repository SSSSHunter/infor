package com.woniu.housemanager.mapper;

import com.woniu.housemanager.pojo.Commercialhousingpresalepermitregistration;
import com.woniu.housemanager.pojo.CommercialhousingpresalepermitregistrationExample;
import java.util.List;
public interface CommercialhousingpresalepermitregistrationMapper {


    int deleteByExample(CommercialhousingpresalepermitregistrationExample example);

    int deleteByPrimaryKey(Integer ccspid);

    int insert(Commercialhousingpresalepermitregistration record);


    List<Commercialhousingpresalepermitregistration> selectByExample(CommercialhousingpresalepermitregistrationExample example);

    Commercialhousingpresalepermitregistration selectByPrimaryKey(Integer ccspid);

}