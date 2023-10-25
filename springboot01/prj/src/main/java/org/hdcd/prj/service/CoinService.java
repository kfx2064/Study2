package org.hdcd.prj.service;

import org.hdcd.prj.domain.ChargeCoin;

import java.util.List;

public interface CoinService {

    public void charge(ChargeCoin chargeCoin) throws Exception;

    public List<ChargeCoin> list(int userNo) throws Exception;

}
