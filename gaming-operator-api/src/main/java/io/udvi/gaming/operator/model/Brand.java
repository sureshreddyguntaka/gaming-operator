package io.udvi.gaming.operator.model;

import io.udvi.gaming.common.model.BaseEntity;
import lombok.Data;

import java.util.Map;

/**
 * Created by sureshreddyguntaka on 11/03/15.
 */
@Data
public class Brand extends BaseEntity {

    private String name;

    private String label;

    private String description;

    private String domain;

    private String uid;

    private Map<String, Object> data;

    private Partner partner;
}
