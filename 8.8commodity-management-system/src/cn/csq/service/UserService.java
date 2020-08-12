package cn.csq.service;

/**
 * @author MSI-PC
 */
public interface UserService {

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    boolean login(String username,String password);

    /**
     * 注册
     * @param username
     * @param password
     * @return
     */
    boolean register(String username, String password);

}
