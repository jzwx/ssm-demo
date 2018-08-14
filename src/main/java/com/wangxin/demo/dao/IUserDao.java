package com.wangxin.demo.dao;

import com.wangxin.demo.mapper.IUserMapper;
import com.wangxin.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Author:jzwx
 * @Desicription: IUserDao
 * @Date:Created in 2018-08-13 15:06
 * @Modified By:
 */
@Repository
public class IUserDao {

    @Autowired
    private IUserMapper iUserMapper;

    public int deleteByPrimaryKey(Integer id) {
        return iUserMapper.deleteByPrimaryKey(id);
    }

    ;

    public int insert(User record) {
        return iUserMapper.insert(record);
    }

    ;

    public int insertSelective(User record) {
        return iUserMapper.insertSelective(record);
    }

    ;

    public User selectByPrimaryKey(Integer id) {
        return iUserMapper.selectByPrimaryKey(id);
    }

    ;

    public int updateByPrimaryKeySelective(User record) {
        return iUserMapper.updateByPrimaryKeySelective(record);
    }

    ;

    public int updateByPrimaryKey(User record) {
        return iUserMapper.updateByPrimaryKey(record);
    }

    ;
}
