package com.ace.hotel.service.impl;

import com.ace.hotel.dao.UserMapper;
import com.ace.hotel.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ace.hotel.service.UserService;

/**
 * @author Ace.ch
 * @version V1.0
 * @Package service.impl
 * @date 2019/10/22 16:35
 */
@Component(value = "userServiceImpl")
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public UserServiceImpl() {
    }

    @Autowired
//    @Qualifier("userMapperProxy") 已使用MapperScannerConfigurer扫描mapper包，自动生成Mapper的代理类，限定名未知，因此Qualifier未找到限定名
    public void setUserMapper(UserMapper userMapper) {
        System.out.println("[DEPENDENCY INJECTION] : " + userMapper + " [INTO] " + this.getClass().getSimpleName());
        this.userMapper = userMapper;
    }

    public User login(String phone, String password) {
        User u = new User();
        u.setPhone(phone);
        u = userMapper.queryUserLimit1(u);
        if (u != null && u.getPassword().equals(password)) {
            return u;
        }
        return null;
    }

    public int register(User user) {
        //状态码，-1表示手机号重复，-2表示身份证重复，-3都重复
        int stateCode = 0;
        //查询是否有重复手机号
        User queryPhone = new User();
        queryPhone.setPhone(user.getPhone());
        stateCode += (queryPhone = userMapper.queryUserLimit1(queryPhone)) == null ? 0 : -1;
        //查询是否有重复身份证
        User queryIdCard = new User();
        queryIdCard.setIdCard(user.getIdCard());
        stateCode += (queryIdCard = userMapper.queryUserLimit1(queryIdCard)) == null ? 0 : -2;
        if (queryPhone == null && queryIdCard == null) {
            stateCode += userMapper.insertUser(user);
        }
        return stateCode;
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public boolean checkPhoneExists(String phone) {
        User u = new User();
        u.setPhone(phone);
        return userMapper.queryUserLimit1(u) != null;
    }

    @Override
    public boolean checkIdCardExists(String idCard) {
        User u = new User();
        u.setIdCard(idCard);
        return userMapper.queryUserLimit1(u) != null;
    }

    @Override
    public boolean checkEmailExists(String email) {
        User u = new User();
        u.setEmail(email);
        return userMapper.queryUserLimit1(u) != null;
    }
}
