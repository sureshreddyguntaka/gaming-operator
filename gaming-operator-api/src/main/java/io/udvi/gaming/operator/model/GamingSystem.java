package io.udvi.gaming.operator.model;

import io.udvi.gaming.common.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * Created by sureshreddyguntaka on 11/03/15.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GamingSystem extends BaseEntity{

    private String name;

    private String description;

    private String uid;

    private Map<String, Object> data;


}
