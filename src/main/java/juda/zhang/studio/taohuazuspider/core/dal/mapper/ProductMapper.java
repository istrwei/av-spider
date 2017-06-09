package juda.zhang.studio.taohuazuspider.core.dal.mapper;

import juda.zhang.studio.taohuazuspider.core.model.ProductDO;

/**
 * Created by zhangchenhui160 on 2017/6/9.
 */
public interface ProductMapper {

    void insert(ProductDO productDO);

    int update(ProductDO productDO);

    void deleteById(long id);
}
