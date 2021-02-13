package com.resourcesapi.studyresources.services;

import com.resourcesapi.studyresources.dao.ResourceDao;
import com.resourcesapi.studyresources.entities.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResourceServiceImpl implements ResourceService{

    @Autowired
    private ResourceDao resourceDao;

    public ResourceServiceImpl() {
    }

    @Override
    public List<Resource> getResources() {
        return resourceDao.findAll();
    }

    @Override
    public Resource getResourceById(long id) {
        return resourceDao.findById(id).get();
    }

    @Override
    public Resource addResource(Resource resource) {
        resourceDao.save(resource);
        return resource;
    }

    @Override
    public Resource updateResource(Resource resource) {
        //the save method if finds an existing object with same id it will update that, hence save can be used here also
        resourceDao.save(resource);
        return resource;
    }

    @Override
    public void deleteResource(long id) {
        //this removes the resource with given id and updates the list
        Resource resource = resourceDao.getOne(id);
        resourceDao.delete(resource);

    }

}
