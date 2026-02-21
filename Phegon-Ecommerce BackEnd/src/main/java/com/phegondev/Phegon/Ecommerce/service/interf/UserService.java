package com.phegondev.Phegon.Ecommerce.service.interf;

import com.phegondev.Phegon.Ecommerce.dto.LoginRequest;
import com.phegondev.Phegon.Ecommerce.dto.Response;
import com.phegondev.Phegon.Ecommerce.dto.UserDto;
import com.phegondev.Phegon.Ecommerce.entity.User;

public interface UserService {
    Response registerUser(UserDto registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getLoginUser();
    Response getUserInfoAndOrderHistory();
}
