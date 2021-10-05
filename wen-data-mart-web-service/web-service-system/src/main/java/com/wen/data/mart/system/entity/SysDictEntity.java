package com.wen.data.mart.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.wen.data.mart.common.entity.BaseEntity;
import lombok.Data;

@Data
@TableName("sys_dict")
public class SysDictEntity extends BaseEntity {

    private String dictName;

    private String dictCode;

    private String dictClass;

    private String description;

    private Integer delFlag;

}
