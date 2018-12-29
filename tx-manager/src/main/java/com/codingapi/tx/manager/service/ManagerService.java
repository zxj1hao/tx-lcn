package com.codingapi.tx.manager.service;

import com.codingapi.tx.commons.rpc.params.NotifyConnectParams;
import com.codingapi.tx.spi.rpc.exception.RpcException;

/**
 * Description:
 * Company: CodingApi
 * Date: 2018/12/29
 *
 * @author codingapi
 */
public interface ManagerService {

    boolean refresh(NotifyConnectParams notifyConnectParams) throws RpcException;
}