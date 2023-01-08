package org.launchcode.trackmyeats.models.data;

import org.launchcode.trackmyeats.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {


}