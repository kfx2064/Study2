package org.hdcd.spring.service;

import org.hdcd.spring.domain.ChargeCoin;
import org.hdcd.spring.domain.PayCoin;

import java.util.List;

public interface CoinService {

    public void charge(ChargeCoin chargeCoin) throws Exception;

    public List<ChargeCoin> list(int userNo) throws Exception;

    public List<PayCoin> listPayHistory(int userNo) throws Exception;

}
