package org.olympos.server;

import org.olympos.entity.DubboTest;
import org.olympos.entity.ListResp;

/**
 * DubboTestService.
 */
public interface DubboTestService {

    DubboTest findById2(String id, String name);

    /**
     * find by id.
     * body：{"id":"1223"}
     *
     * @param id id
     * @return DubboTest dubbo test
     */
    DubboTest findById(String id);

    /**
     * Find all dubbo test.
     *
     * @return the dubbo test
     */
    DubboTest findAll();

    /**
     * Insert dubbo test.
     * body :{"id":"122344","name":"xiaoyu"}
     *
     * @param dubboTest the dubbo test
     * @return the dubbo test
     */
    DubboTest insert(DubboTest dubboTest);

    ListResp findList();
}
