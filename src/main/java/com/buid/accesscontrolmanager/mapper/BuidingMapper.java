package com.buid.accesscontrolmanager.mapper;

import com.buid.accesscontrolmanager.entity.Buiding;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BuidingMapper {
    public List<Buiding> getAll();
}
