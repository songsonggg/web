package com.example.web.controller;



import com.example.web.dao.MmallCartDao;
import com.example.web.dao.MmallUserDao;
import com.example.web.pojo.MmallCart;
import com.example.web.pojo.MmallUser;
import com.example.web.service.TestTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EditController {
    @Autowired
    MmallUserDao mmallUserDao;

    @Autowired
    MmallCartDao mmallCartDao;

    @Autowired
    TestTransactionService testTransactionService;

    @RequestMapping(value="/get/users")
    public List<MmallUser> getFromDatasource(){
        return mmallUserDao.getAllJdbcVersion();
    }

    @RequestMapping(value="/get/carts")
    public List<MmallCart> getFromMybatis(){
        return mmallCartDao.getAllCart();
    }

    @RequestMapping(value="/update/cart")
    public Integer updateCartQuantity(@RequestParam Integer value){
        return mmallCartDao.updateCartQuantity(value);
    }

    // cart 从2 -> 1,  010 -> 020
    @RequestMapping(value="/has")
    public String testTransaction(){
        return "" + testTransactionService.testHasTransaction(2, "020");
    }

    // cart 从2 -> 1,  010 -> 020
    @RequestMapping(value="/no")
    public String testTransactionFail(){
        return "" + testTransactionService.testNoTransaction(2, "020");
    }


    @RequestMapping(value="/restore")
    public String restore(){
        return "" + testTransactionService.restore(1, "010");
    }
}
