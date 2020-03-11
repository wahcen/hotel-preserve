package com.ace.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.ace.hotel.model.User;
import com.ace.hotel.dao.base.UserBaseMapper;

/**
 * 在此文件添加自己想要加入的Mapper函数，比如queryUserByName
 * 当然你也可以使用，baseMapper中的queryUserLimit1,最好仅限于User的某项属性是unique的查询，例如对phone的查询，每个用户的手机号是唯一的
 * 示例：(service层)
 * User u = new User(); u.setPhone("13800001234");
 * User query = userMapper.queryUserLimit1(u);
 * 那么查询的等价sql为： select * from t_user where phone='13800001234'，mybatis的映射器会自动将结果组装为User
 * 拓展：
 * User u = new User(); u.setUserName("小王");
 * List<User> query = userMapper.queryUser(u);
 * 那么等价的sql为： select * from t_user where userName='小王'，返回多个userName为小王的对象
 *
 * @author author
 */
public interface UserMapper extends UserBaseMapper {


}