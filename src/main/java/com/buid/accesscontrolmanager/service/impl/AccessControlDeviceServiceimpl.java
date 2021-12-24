package com.buid.accesscontrolmanager.service.impl;

import com.buid.accesscontrolmanager.entity.AccessControlDevice;
import com.buid.accesscontrolmanager.mapper.AccessControlDeviceMapper;
import com.buid.accesscontrolmanager.service.AccessControlDeviceService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccessControlDeviceServiceimpl implements AccessControlDeviceService {
    @Resource
    private AccessControlDeviceMapper mapper;
    @Override
    public List<AccessControlDevice> getAll(int id) {
        return mapper.getAll(id);
    }
}
