package com.samiulalomsium.springbootblog.repo;

import com.samiulalomsium.springbootblog.model.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository extends ElasticsearchRepository<User, String> {

    User findByUsername(String username);

}
