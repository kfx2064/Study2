package org.hdcd.prj.service;

import org.hdcd.prj.domain.ChargeCoin;
import org.hdcd.prj.domain.PayCoin;
import org.hdcd.prj.mapper.CoinMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CoinServiceImpl implements CoinService {

    @Autowired
    private CoinMapper mapper;

    @Transactional
    @Override
    public void charge(ChargeCoin chargeCoin) throws Exception {
        mapper.charge(chargeCoin);
        mapper.create(chargeCoin);
    }

    @Override
    public List<ChargeCoin> list(int userNo) throws Exception {
        return mapper.list(userNo);
    }

    @Override
    public List<PayCoin> listPayHistory(int userNo) throws Exception {
        return mapper.listPayHistory(userNo);
    }
}
