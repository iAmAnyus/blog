package com.anyus.blog.dao;

import com.anyus.blog.entity.ChatRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * 聊天记录
 *
 * @author yezhiqiu
 * @date 2021/08/10
 */
@Repository
public interface ChatRecordDao extends BaseMapper<ChatRecord> {
}
