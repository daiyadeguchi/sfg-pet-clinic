package com.daiyadeguchi.sfgpetclinic.services;

import com.daiyadeguchi.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
