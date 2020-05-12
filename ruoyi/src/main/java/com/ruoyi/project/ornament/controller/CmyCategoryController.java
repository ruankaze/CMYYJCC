package com.ruoyi.project.ornament.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.ornament.domain.CmyCategory;
import com.ruoyi.project.ornament.service.ICmyCategoryService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 饰品类别Controller
 * 
 * @author linxiao
 * @date 2020-05-12
 */
@RestController
@RequestMapping("/ornament/category")
public class CmyCategoryController extends BaseController
{
    @Autowired
    private ICmyCategoryService cmyCategoryService;

    /**
     * 查询饰品类别列表
     */
    @PreAuthorize("@ss.hasPermi('ornament:category:list')")
    @GetMapping("/list")
    public AjaxResult list(CmyCategory cmyCategory)
    {
        List<CmyCategory> list = cmyCategoryService.selectCmyCategoryList(cmyCategory);
        return AjaxResult.success(list);
    }

    /**
     * 导出饰品类别列表
     */
    @PreAuthorize("@ss.hasPermi('ornament:category:export')")
    @Log(title = "饰品类别", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(CmyCategory cmyCategory)
    {
        List<CmyCategory> list = cmyCategoryService.selectCmyCategoryList(cmyCategory);
        ExcelUtil<CmyCategory> util = new ExcelUtil<CmyCategory>(CmyCategory.class);
        return util.exportExcel(list, "category");
    }

    /**
     * 获取饰品类别详细信息
     */
    @PreAuthorize("@ss.hasPermi('ornament:category:query')")
    @GetMapping(value = "/{categoryId}")
    public AjaxResult getInfo(@PathVariable("categoryId") Long categoryId)
    {
        return AjaxResult.success(cmyCategoryService.selectCmyCategoryById(categoryId));
    }

    /**
     * 新增饰品类别
     */
    @PreAuthorize("@ss.hasPermi('ornament:category:add')")
    @Log(title = "饰品类别", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CmyCategory cmyCategory)
    {
        return toAjax(cmyCategoryService.insertCmyCategory(cmyCategory));
    }

    /**
     * 修改饰品类别
     */
    @PreAuthorize("@ss.hasPermi('ornament:category:edit')")
    @Log(title = "饰品类别", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CmyCategory cmyCategory)
    {
        return toAjax(cmyCategoryService.updateCmyCategory(cmyCategory));
    }

    /**
     * 删除饰品类别
     */
    @PreAuthorize("@ss.hasPermi('ornament:category:remove')")
    @Log(title = "饰品类别", businessType = BusinessType.DELETE)
	@DeleteMapping("/{categoryIds}")
    public AjaxResult remove(@PathVariable Long[] categoryIds)
    {
        return toAjax(cmyCategoryService.deleteCmyCategoryByIds(categoryIds));
    }
}
