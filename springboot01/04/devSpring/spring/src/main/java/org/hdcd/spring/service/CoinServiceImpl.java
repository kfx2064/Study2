package org.hdcd.spring.service;

import org.hdcd.spring.domain.ChargeCoin;
import org.hdcd.spring.mapper.CoinMapper;
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
}
