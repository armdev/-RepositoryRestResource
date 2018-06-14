package io.project.mongo.repositories;

import io.project.mongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author armen
 */
@Component
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends MongoRepository<User, String> {

}
