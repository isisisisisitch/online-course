package ca.bytetube.server.service;

import ca.bytetube.server.domain.Test;
import ca.bytetube.server.domain.TestExample;
import ca.bytetube.server.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        TestExample testExample = new TestExample();
        testExample.createCriteria().andIdEqualTo("1");
        //testExample.setOrderByClause("id desc");
        return testMapper.selectByExample(testExample);

    }
}

