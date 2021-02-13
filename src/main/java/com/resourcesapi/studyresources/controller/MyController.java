package com.resourcesapi.studyresources.controller;

import com.resourcesapi.studyresources.entities.Resource;
import com.resourcesapi.studyresources.services.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private ResourceService resourceService;

    @GetMapping("/resources")
    public List<Resource> getResources() {
        return this.resourceService.getResources();
    }

    @GetMapping("/resources/{id}")
    public Resource getResource(@PathVariable String id) {
        return this.resourceService.getResourceById(Long.parseLong(id));
    }

    @PostMapping("/resources")
    public Resource addResource(@RequestBody Resource resource) {
        return this.resourceService.addResource(resource);
    }

    @PutMapping("/resources")
    public Resource updateResource(@RequestBody Resource resource) {
        return this.resourceService.updateResource(resource);
    }

    @DeleteMapping("/resources/{id}")
    public ResponseEntity<HttpStatus> deleteResource(@PathVariable String id) {
        try{
            this.resourceService.deleteResource(Long.parseLong(id));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

