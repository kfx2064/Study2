package com.springboot.security.data.repository;

import com.springboot.security.data.entity.User;

public interface UserRepository {

    User getByUid(String uid);
}
