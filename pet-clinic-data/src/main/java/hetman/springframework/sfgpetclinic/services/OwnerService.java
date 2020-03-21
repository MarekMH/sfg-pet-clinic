package hetman.springframework.sfgpetclinic.services;

import hetman.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
    Owner findByLastName(String lastName);
}
