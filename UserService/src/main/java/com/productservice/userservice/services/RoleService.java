package com.productservice.userservice.services;

import com.productservice.userservice.models.Role;
import com.productservice.userservice.repositories.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    private RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role createRole(String name) {
        Role role = new Role();
        role.setRole(name);

        return roleRepository.save(role);
    }
}
