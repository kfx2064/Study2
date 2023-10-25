package org.hdcd.prj.mapper;

import org.hdcd.prj.domain.ChargeCoin;

import java.util.List;

public interface CoinMapper {

    public void create(ChargeCoin chargeCoin) throws Exception;

    public void charge(ChargeCoin chargeCoin) throws Exception;

    public List<ChargeCoin> list(int userNo) throws Exception;
}
