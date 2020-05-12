package com.ruoyi.project.ornament.mapper;

import java.util.List;
import com.ruoyi.project.ornament.domain.CmyCategory;

/**
 * 饰品类别Mapper接口
 * 
 * @author linxiao
 * @date 2020-05-12
 */
public interface CmyCategoryMapper 
{
    /**
     * 查询饰品类别
     * 
     * @param categoryId 饰品类别ID
     * @return 饰品类别
     */
    public CmyCategory selectCmyCategoryById(Long categoryId);

    /**
     * 查询饰品类别列表
     * 
     * @param cmyCategory 饰品类别
     * @return 饰品类别集合
     */
    public List<CmyCategory> selectCmyCategoryList(CmyCategory cmyCategory);

    /**
     * 新增饰品类别
     * 
     * @param cmyCategory 饰品类别
     * @return 结果
     */
    public int insertCmyCategory(CmyCategory cmyCategory);

    /**
     * 修改饰品类别
     * 
     * @param cmyCategory 饰品类别
     * @return 结果
     */
    public int updateCmyCategory(CmyCategory cmyCategory);

    /**
     * 删除饰品类别
     * 
     * @param categoryId 饰品类别ID
     * @return 结果
     */
    public int deleteCmyCategoryById(Long categoryId);

    /**
     * 批量删除饰品类别
     * 
     * @param categoryIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCmyCategoryByIds(Long[] categoryIds);
}
