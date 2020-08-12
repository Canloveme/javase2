package cn.csq.repository;

import cn.csq.domain.Commodity;

import java.io.IOException;
import java.util.List;

/**
 * @author MSI-PC
 * 商品
 */
public interface CommodityRepository {


    /**
     * 添加商品
     * @param commodity 商品信息
     * @return 是否添加成功
     */
    boolean add(Commodity commodity) throws IOException;


    /**
     * 查询所有商品
     *
     * @return
     */
    List<Commodity> findAll() throws IOException, ClassNotFoundException;
}
