package org.hdcd.prj.service;

import org.hdcd.prj.domain.ChargeCoin;
import org.hdcd.prj.domain.PayCoin;

import java.util.List;

public interface CoinService {

    public void charge(ChargeCoin chargeCoin) throws Exception;

    public List<ChargeCoin> list(int userNo) throws Exception;

    public List<PayCoin> listPayHistory(int userNo) throws Exception;

}
