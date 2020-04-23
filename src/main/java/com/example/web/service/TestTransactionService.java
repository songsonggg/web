package com.example.web.service;

import com.example.web.dao.MmallCartDao;
import com.example.web.dao.MmallShippingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestTransactionService {
    @Autowired
    MmallCartDao mmallCartDao;

    @Autowired
    MmallShippingDao mmallShippingDao;

    //cart 从2 -> 1,  shipping 010 -> 020
    public boolean testHasTransaction(int quantity, String phoneNumber){
        boolean first =  mmallCartDao.updateCartQuantity(quantity) == 1;
        int a = 1/0;
        boolean second = mmallShippingDao.updateRecieverPhone(phoneNumber) == 1;
        return first && second;
    }

    @Transactional
    public boolean restore(int quantity, String phoneNumber){
        boolean first =  mmallCartDao.updateCartQuantity(quantity) == 1;
        boolean second = mmallShippingDao.updateRecieverPhone(phoneNumber) == 1;
        return first && second;
    }

    @Transactional
    public boolean testNoTransaction(int quantity, String phoneNumber){
        boolean first =  mmallCartDao.updateCartQuantity(quantity) == 1;
        int a = 1/0;
        boolean second = mmallShippingDao.updateRecieverPhone(phoneNumber) == 1;
        return first && second;
    }

}
