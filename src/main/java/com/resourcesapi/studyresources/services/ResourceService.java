package com.resourcesapi.studyresources.services;

import com.resourcesapi.studyresources.entities.Resource;

import java.util.List;

public interface ResourceService {

    public List<Resource> getResources();
    public Resource getResourceById(long id);
    public Resource addResource(Resource resource);
    public Resource updateResource(Resource resource);
    public void deleteResource(long id);

}
