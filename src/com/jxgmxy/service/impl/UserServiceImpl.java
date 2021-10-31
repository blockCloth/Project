package com.jxgmxy.service.impl;

import com.jxgmxy.dao.UserDao;
import com.jxgmxy.dao.impl.UserDaoImpl;
import com.jxgmxy.service.UserService;

/**
 * @author dai
 * @create 2021-10-2021/10/28  14-51-46
 */
public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();

    @Override
    public boolean selectUser(String name, String passwd) {
        return userDao.selectUser(name, passwd);
    }

    @Override
    public int registUser(String name, String passwd) {
        return userDao.registUser(name,passwd);
    }

    @Override
    public Integer countMoney(String[] clothings, String[] trousers, String[] shoes) {
        //先对每种物品的金额进行处理
        Integer sum = new Integer(0);
        //对衣服进行金额统计
        if (clothings != null) {
            for (String clothing : clothings) {
                sum += Integer.valueOf(clothing);
            }
        }
        //对裤子进行统计
        if (trousers != null) {
            for (String trouser : trousers) {
                sum += Integer.valueOf(trouser);
            }
        }

        //对鞋子进行统计
        if (shoes != null) {
            for (String shoe : shoes) {
                sum += Integer.valueOf(shoe);
            }
        }
        return sum;
    }
}
