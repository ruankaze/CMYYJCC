package com.ruoyi.project.precious.mapper;

import com.ruoyi.project.system.domain.SysUser;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author NingZe
 * description:
 * path: CMYYJCC-com.ruoyi.project.precious.mapper-publicDao
 * date: 2020/5/14 0014 16:31
 * version: 02.06
 * To change this template use File | Settings | File Templates.
 */
@Service
public interface PublicDao {

    /**
     * find user paging
     * @param c
     * @return list
     */
    @Select("<script> " +
            " SELECT * FROM sys_user " +
            " WHERE 1 = 1" +
            "   <if test='nickName != null and nickName != \"\"'> AND nick_name LIKE CONCAT('%', #{nickName}, '%') </if> " +
            "</script>")
    List<SysUser> findUserPaging(SysUser c);

}
