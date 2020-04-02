package com.project.Repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.project.pojo.User;

public interface UserRepository extends CassandraRepository<User, Integer>{

}
