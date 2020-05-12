package com.ruoyi.project.precious.pubcontroller;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.precious.domain.Approval;
import com.ruoyi.project.precious.mapper.ApprovalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @author NingZe
 * description: public interface controller
 * path: RuoYi-Vue-com.ruoyi.project.precious-PublicInterfaceController
 * date: 2020/5/12 0012 11:22
 * version: 02.06
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/precious/public")
public class PublicInterfaceController extends BaseController {

    @Autowired
    private ApprovalDao npads;

    /**
     * @Function: TODO
     * @description: node project approval paging
     *
     * @author: NingZe
     * @date: 2020/5/12 0012 11:24
     * @params: [npal]
     * @version: 02.06
     * @return: com.ruoyi.framework.web.page.TableDataInfo
     */
    @RequestMapping("/paging")
    public TableDataInfo paging(Approval npal) {
        startPage();
        return getDataTable(npads.findApprovalPaging(npal));
    }

}
