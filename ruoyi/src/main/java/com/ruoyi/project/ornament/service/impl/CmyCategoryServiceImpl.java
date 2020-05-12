package com.ruoyi.project.ornament.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.ornament.mapper.CmyCategoryMapper;
import com.ruoyi.project.ornament.domain.CmyCategory;
import com.ruoyi.project.ornament.service.ICmyCategoryService;

/**
 * 饰品类别Service业务层处理
 * 
 * @author linxiao
 * @date 2020-05-12
 */
@Service
public class CmyCategoryServiceImpl implements ICmyCategoryService 
{
    @Autowired
    private CmyCategoryMapper cmyCategoryMapper;

    /**
     * 查询饰品类别
     * 
     * @param categoryId 饰品类别ID
     * @return 饰品类别
     */
    @Override
    public CmyCategory selectCmyCategoryById(Long categoryId)
    {
        return cmyCategoryMapper.selectCmyCategoryById(categoryId);
    }

    /**
     * 查询饰品类别列表
     * 
     * @param cmyCategory 饰品类别
     * @return 饰品类别
     */
    @Override
    public List<CmyCategory> selectCmyCategoryList(CmyCategory cmyCategory)
    {
        return cmyCategoryMapper.selectCmyCategoryList(cmyCategory);
    }

    /**
     * 新增饰品类别
     * 
     * @param cmyCategory 饰品类别
     * @return 结果
     */
    @Override
    public int insertCmyCategory(CmyCategory cmyCategory)
    {
        cmyCategory.setCreateTime(DateUtils.getNowDate());
        return cmyCategoryMapper.insertCmyCategory(cmyCategory);
    }

    /**
     * 修改饰品类别
     * 
     * @param cmyCategory 饰品类别
     * @return 结果
     */
    @Override
    public int updateCmyCategory(CmyCategory cmyCategory)
    {
        return cmyCategoryMapper.updateCmyCategory(cmyCategory);
    }

    /**
     * 批量删除饰品类别
     * 
     * @param categoryIds 需要删除的饰品类别ID
     * @return 结果
     */
    @Override
    public int deleteCmyCategoryByIds(Long[] categoryIds)
    {
        return cmyCategoryMapper.deleteCmyCategoryByIds(categoryIds);
    }

    /**
     * 删除饰品类别信息
     * 
     * @param categoryId 饰品类别ID
     * @return 结果
     */
    @Override
    public int deleteCmyCategoryById(Long categoryId)
    {
        return cmyCategoryMapper.deleteCmyCategoryById(categoryId);
    }
}
