package com.dailicodework.lakesidehotel.service;

import com.dailicodework.lakesidehotel.model.Role;
import com.dailicodework.lakesidehotel.model.User;

import java.util.List;

public interface IRoleService {
    List<Role> getRoles();

    Role createRole(Role theRole);

    void deleteRole(Long id);

    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);

    User assignRoleToUser(Long userId, Long roleId);

    Role removeAllUsersFromRole(Long roleId);
}
