package com.wen.data.mart.system.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wen.data.mart.system.entity.SysDictEntity;
import com.wen.data.mart.system.service.SysDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("system")
public class SysDictController {

    @Autowired
    SysDictService sysDictService;

    @GetMapping("list")
    public List<SysDictEntity> list(SysDictEntity record){
        List<SysDictEntity> list = sysDictService.list(new QueryWrapper<>(record));
        return list;
    }
}
