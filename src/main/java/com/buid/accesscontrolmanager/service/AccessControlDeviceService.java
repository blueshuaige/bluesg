package com.buid.accesscontrolmanager.service;

import com.buid.accesscontrolmanager.entity.AccessControlDevice;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface AccessControlDeviceService {
    public List<AccessControlDevice> getAll(@Param("id") int id);
}
