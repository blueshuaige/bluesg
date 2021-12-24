package com.buid.accesscontrolmanager.service.impl;

import com.buid.accesscontrolmanager.entity.Buiding;
import com.buid.accesscontrolmanager.mapper.BuidingMapper;
import com.buid.accesscontrolmanager.service.BuidingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BuidingServiceimpl  implements BuidingService {
    @Resource
    private BuidingMapper mapper;
    @Override
    public List<Buiding> getAll() {
        return mapper.getAll();
    }
}
