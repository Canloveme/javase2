package cn.csq.service.impl;

import cn.csq.domain.Commodity;
import cn.csq.repository.CommodityRepository;
import cn.csq.repository.impl.CommodityRepositoryImpl;
import cn.csq.service.CommodityService;

import java.io.IOException;
import java.util.List;

/**
 * @author csq
 * @date 2020/8/8 14:29
 */
public class CommodityServiceImpl implements CommodityService {

    private CommodityRepository commodityRepository = new CommodityRepositoryImpl();

    public CommodityServiceImpl() throws IOException {
    }

    @Override
    public boolean add(Commodity commodity) throws IOException {
       return commodityRepository.add(commodity);
    }

    @Override
    public List<Commodity> findAll() throws IOException, ClassNotFoundException {
        return commodityRepository.findAll();
    }
}
