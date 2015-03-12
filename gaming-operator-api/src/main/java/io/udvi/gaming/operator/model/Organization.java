package io.udvi.gaming.operator.model;

import io.udvi.gaming.common.model.BaseEntity;
import lombok.Data;

/**
 * Created by sureshreddyguntaka on 12/03/15.
 */
@Data
public class Organization extends BaseEntity{

    private String name;

    private String uid;

    private String label;

    private String url;

    private Partner partner;

}
