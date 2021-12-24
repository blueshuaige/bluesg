package com.buid.accesscontrolmanager.mapper;

import com.buid.accesscontrolmanager.entity.AccessControlDevice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AccessControlDeviceMapper {
    public List<AccessControlDevice> getAll(@Param("id") int id);
}
