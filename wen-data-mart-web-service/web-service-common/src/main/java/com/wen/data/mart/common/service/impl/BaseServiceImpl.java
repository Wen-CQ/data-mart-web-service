package com.wen.data.mart.common.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wen.data.mart.common.service.IBaseService;

public class BaseServiceImpl<M extends BaseMapper<T>,T> extends ServiceImpl<M,T> implements IBaseService<T> {



}
