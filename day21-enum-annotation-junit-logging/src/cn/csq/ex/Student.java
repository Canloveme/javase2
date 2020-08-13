package cn.csq.ex;

/**
 * @author csq
 * @date 2020/8/13 18:07
 */
public class Student {


    @Autowired
    private Teacher teacher;


    public void show() {
        teacher.find();
    }
}
