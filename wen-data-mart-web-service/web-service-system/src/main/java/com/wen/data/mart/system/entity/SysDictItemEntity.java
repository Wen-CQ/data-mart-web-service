package com.wen.data.mart.system.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.wen.data.mart.common.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (SysDictItem)表实体类
 *
 * @author makejava
 * @since 2021-10-06 11:40:00
 */
@Data
public class SysDictItemEntity extends BaseEntity {

    private Integer id;
    //父表ID
    private String dictId;
    //字典项文本
    private String itemText;
    //字典项编码
    private String itemCode;
    //字典项描述
    private String description;
    //字典项排序分数
    private Integer scores;
    //删除状态 0 正常 1 删除
    private Integer delFlag;



}

