package com.github.allisson95.pfadocker.challengeonebackend.domain.repository;

import java.util.UUID;

import com.github.allisson95.pfadocker.challengeonebackend.domain.model.Module;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModulesRepository extends JpaRepository<Module, UUID> {
    
}
