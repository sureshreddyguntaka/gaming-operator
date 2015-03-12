package io.udvi.gaming.operator.service;

import io.udvi.gaming.common.service.CurdEntityService;
import io.udvi.gaming.operator.model.GamingSystem;
import io.udvi.rpc.common.annotation.Remote;

/**
 * Created by sureshreddyguntaka on 12/03/15.
 */
@Remote
public interface GamingSystemService extends CurdEntityService<GamingSystem,String> {
}
