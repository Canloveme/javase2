package cn.csq.repository.impl;

import cn.csq.repository.UserRepository;

import java.util.HashMap;

/**
 * @author csq
 * @date 2020/8/8 14:21
 */
public class UserRepositoryImpl implements UserRepository {

    private HashMap<String, String> users = new HashMap<String, String>();

    @Override
    public boolean login(String username, String password) throws NullPointerException {
        return users.get(username).equals(password);
    }

    @Override
    public boolean register(String username, String password) {
        if (users.containsKey(username)) {
            return false;
        }
        users.put(username, password);
        return true;
    }
}
