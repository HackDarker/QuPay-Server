package com.ntnikka.modules.merchantManager.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ntnikka.modules.merchantManager.entity.ChannelEntity;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @ClassName ChannelDao
 * @Author Liuq
 * @Description todo
 * @Date 2018/12/3 15:26
 **/
@Repository
public interface ChannelDao extends BaseMapper<ChannelEntity> {
    void updateChannelFlag(Map map);

    void delChannel(Map map);
}
