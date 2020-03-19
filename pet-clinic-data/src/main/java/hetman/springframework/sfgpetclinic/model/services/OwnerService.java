package hetman.springframework.sfgpetclinic.model.services;

import hetman.springframework.sfgpetclinic.model.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
}
