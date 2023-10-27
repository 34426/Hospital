package com.bear.hospital.service;

import com.bear.hospital.pojo.Arrange;

import java.util.List;

public interface ArrangeService {
    /**
     * 根据日期查询排班信息
     */
    List<Arrange> findByTime(String arTime, String dSection);
    /**
     * 增加排班信息
     */
    Boolean addArrange(Arrange arrange);
    /**
     * 删除排班信息
     */
    Boolean deleteArrange(String arId);
}
