package com.ninetyninesoft.education.service;

import com.ninetyninesoft.education.model.User;
import com.ninetyninesoft.education.generic.GenericService;

public interface UserService extends GenericService<User> {

    boolean authenticate(String email, String password);

    User findByEmail(String email);

}
