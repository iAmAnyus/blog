package com.anyus.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.anyus.blog.dto.OperationLogDTO;
import com.anyus.blog.vo.PageResult;
import com.anyus.blog.entity.OperationLog;
import com.anyus.blog.vo.ConditionVO;

/**
 * 操作日志服务
 *
 * @author yezhiqiu
 * @date 2021/07/29
 */
public interface OperationLogService extends IService<OperationLog> {

    /**
     * 查询日志列表
     *
     * @param conditionVO 条件
     * @return 日志列表
     */
    PageResult<OperationLogDTO> listOperationLogs(ConditionVO conditionVO);

}
