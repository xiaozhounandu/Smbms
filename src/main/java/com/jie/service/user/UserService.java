package com.jie.service.user;

import com.jie.pojo.User;

import java.util.List;

public interface UserService {
    //用户登录
    public User login(String userCode ,String password);
    //根据id修改密码
    public boolean updatePwd(int id , String pwd) throws ClassNotFoundException;
    //查询记录数
    public  int getUserCount(String username, int userRole);
    //根据条件查询用户列表
    public List<User> getUserList(String queryUserName, int queryUserRole ,int currentPageNo,int pageSize);

    public User selectUserCodeExist(String userCode);

    public boolean deleteUserById(Integer delId);

    public User getUserById(String id);

    public boolean modify(User user);


     boolean add(User user);
}


