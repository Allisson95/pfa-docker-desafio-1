package com.github.allisson95.pfadocker.challengeonebackend.api.controller;

import java.util.List;

import com.github.allisson95.pfadocker.challengeonebackend.domain.model.Module;
import com.github.allisson95.pfadocker.challengeonebackend.domain.services.ModulesService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/modules")
class ModulesResource {

    private final ModulesService modulesService;

    @GetMapping()
    List<Module> findAll() {
        return this.modulesService.findAll();
    }

}
