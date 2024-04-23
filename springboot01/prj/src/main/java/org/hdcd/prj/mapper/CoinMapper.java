package org.hdcd.prj.mapper;

import org.hdcd.prj.domain.ChargeCoin;
import org.hdcd.prj.domain.PayCoin;

import java.util.List;

public interface CoinMapper {

    public void create(ChargeCoin chargeCoin) throws Exception;

    public void charge(ChargeCoin chargeCoin) throws Exception;

    public List<ChargeCoin> list(int userNo) throws Exception;

    public void createPayHistory(PayCoin payCoin) throws Exception;

    public List<PayCoin> listPayHistory(int userNo) throws Exception;

    public void pay(PayCoin payCoin) throws Exception;
}
