package com.ruoyi.project.precious.mapper;

import com.ruoyi.project.precious.domain.Approval;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author linxiao
 */
@Service
public interface ApprovalDao {

    /**
     * find scheduling paging
     * @param c
     * @return list
     */
    @Select("<script> " +
            " SELECT * FROM node_project_approval " +
            " WHERE 1 = 1" +
            "   <if test='npaProjectName != null and npaProjectName != \"\"'> AND npa_project_name LIKE CONCAT('%', #{npaProjectName}, '%') </if> " +
            "</script>")
    List<Approval> findApprovalPaging(Approval c);

}
