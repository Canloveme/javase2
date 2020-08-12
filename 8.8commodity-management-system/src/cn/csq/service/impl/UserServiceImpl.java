package cn.csq.service.impl;

import cn.csq.repository.UserRepository;
import cn.csq.repository.impl.UserRepositoryImpl;
import cn.csq.service.UserService;

/**
 * @author csq
 * @date 2020/8/8 14:19
 */
public class UserServiceImpl implements UserService {

    private UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public boolean login(String username, String password) throws NullPointerException {
        return userRepository.login(username,password);
    }

    @Override
    public boolean register(String username, String password) {
        return userRepository.register(username, password);
    }
}
