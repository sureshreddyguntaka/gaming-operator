package io.udvi.gaming.operator.model;

import io.udvi.gaming.common.model.BaseEntity;
import lombok.Data;

import java.util.Set;

/**
 * Created by sureshreddyguntaka on 11/03/15.
 */
@Data
public class Operator extends BaseEntity {

    private String firstName;

    private String lastName;

    private String email;

    private String mobile;

    private Set<Brand> allowedBrands;

    private Organization organization;

    private Partner partner;

}
