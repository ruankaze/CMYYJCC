package com.ruoyi.project.precious.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 我的项目对象 node_project_approval
 * 
 * @author linxiao
 * @date 2020-05-09
 */
public class Approval extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增ID */
    private Long npaId;

    /** 设计师ID */
    private Long npaUserid;

    /** 订单ID */
    private String npaOrderid;

    /** 项目图片 */
    @Excel(name = "项目图片")
    private String npaProjectImage;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String npaProjectName;

    /** 项目简称 */
    @Excel(name = "项目简称")
    private String npaSimpleName;

    /** 协作编号 */
    @Excel(name = "协作编号")
    private String npaTeamCode;

    /** 立项时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "立项时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date npaApprovalTime;

    /** 交付时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "交付时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date npaDeliveryTime;

    /** 监理编号 */
    @Excel(name = "监理编号")
    private Long npaProjectSupervisor;

    /** 立项状态 */
    private Integer npaApprovalStatus;

    /** 是否删除 */
    private Integer npaIsdel;

    /** 进展状态 */
    @Excel(name = "进展状态")
    private Integer npaStart;

    /** 排产状态 */
    @Excel(name = "排产状态")
    private Integer npaSchedulingStatus;

    /** 排产时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "排产时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date npaSchedulingTime;

    public void setNpaId(Long npaId) 
    {
        this.npaId = npaId;
    }

    public Long getNpaId() 
    {
        return npaId;
    }
    public void setNpaUserid(Long npaUserid) 
    {
        this.npaUserid = npaUserid;
    }

    public Long getNpaUserid() 
    {
        return npaUserid;
    }
    public void setNpaOrderid(String npaOrderid) 
    {
        this.npaOrderid = npaOrderid;
    }

    public String getNpaOrderid() 
    {
        return npaOrderid;
    }
    public void setNpaProjectImage(String npaProjectImage) 
    {
        this.npaProjectImage = npaProjectImage;
    }

    public String getNpaProjectImage() 
    {
        return npaProjectImage;
    }
    public void setNpaProjectName(String npaProjectName) 
    {
        this.npaProjectName = npaProjectName;
    }

    public String getNpaProjectName() 
    {
        return npaProjectName;
    }
    public void setNpaSimpleName(String npaSimpleName) 
    {
        this.npaSimpleName = npaSimpleName;
    }

    public String getNpaSimpleName() 
    {
        return npaSimpleName;
    }
    public void setNpaTeamCode(String npaTeamCode) 
    {
        this.npaTeamCode = npaTeamCode;
    }

    public String getNpaTeamCode() 
    {
        return npaTeamCode;
    }
    public void setNpaApprovalTime(Date npaApprovalTime) 
    {
        this.npaApprovalTime = npaApprovalTime;
    }

    public Date getNpaApprovalTime() 
    {
        return npaApprovalTime;
    }
    public void setNpaDeliveryTime(Date npaDeliveryTime) 
    {
        this.npaDeliveryTime = npaDeliveryTime;
    }

    public Date getNpaDeliveryTime() 
    {
        return npaDeliveryTime;
    }
    public void setNpaProjectSupervisor(Long npaProjectSupervisor) 
    {
        this.npaProjectSupervisor = npaProjectSupervisor;
    }

    public Long getNpaProjectSupervisor() 
    {
        return npaProjectSupervisor;
    }
    public void setNpaApprovalStatus(Integer npaApprovalStatus) 
    {
        this.npaApprovalStatus = npaApprovalStatus;
    }

    public Integer getNpaApprovalStatus() 
    {
        return npaApprovalStatus;
    }
    public void setNpaIsdel(Integer npaIsdel) 
    {
        this.npaIsdel = npaIsdel;
    }

    public Integer getNpaIsdel() 
    {
        return npaIsdel;
    }
    public void setNpaStart(Integer npaStart) 
    {
        this.npaStart = npaStart;
    }

    public Integer getNpaStart() 
    {
        return npaStart;
    }
    public void setNpaSchedulingStatus(Integer npaSchedulingStatus) 
    {
        this.npaSchedulingStatus = npaSchedulingStatus;
    }

    public Integer getNpaSchedulingStatus() 
    {
        return npaSchedulingStatus;
    }
    public void setNpaSchedulingTime(Date npaSchedulingTime) 
    {
        this.npaSchedulingTime = npaSchedulingTime;
    }

    public Date getNpaSchedulingTime() 
    {
        return npaSchedulingTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("npaId", getNpaId())
            .append("npaUserid", getNpaUserid())
            .append("npaOrderid", getNpaOrderid())
            .append("npaProjectImage", getNpaProjectImage())
            .append("npaProjectName", getNpaProjectName())
            .append("npaSimpleName", getNpaSimpleName())
            .append("npaTeamCode", getNpaTeamCode())
            .append("npaApprovalTime", getNpaApprovalTime())
            .append("npaDeliveryTime", getNpaDeliveryTime())
            .append("npaProjectSupervisor", getNpaProjectSupervisor())
            .append("npaApprovalStatus", getNpaApprovalStatus())
            .append("npaIsdel", getNpaIsdel())
            .append("npaStart", getNpaStart())
            .append("npaSchedulingStatus", getNpaSchedulingStatus())
            .append("npaSchedulingTime", getNpaSchedulingTime())
            .toString();
    }
}
