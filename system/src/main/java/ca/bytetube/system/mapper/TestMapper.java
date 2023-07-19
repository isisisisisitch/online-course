package ca.bytetube.system.mapper;

import ca.bytetube.system.domain.Test;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface TestMapper {
    
    List<Test> list();
}