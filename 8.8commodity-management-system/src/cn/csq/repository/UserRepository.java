package cn.csq.repository;

/**
 * @author csq
 * @date 2020/8/8 14:17
 * 用户
 */
public interface UserRepository {
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
