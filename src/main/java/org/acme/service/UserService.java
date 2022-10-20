package org.acme.service;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import io.vertx.mutiny.ext.auth.User;

public class UserService {

    @Inject
    EntityManager em;

    // @Transactional 
    // public void createUser(String username) {
    //     User user = new User();
    //     user.setName(username);
    //     user.setPassword(username);
    //     em.persist(user);
    // }
}
