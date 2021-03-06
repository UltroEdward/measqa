package com.measqa.rest.application;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.measqa.entity.Project;
import com.measqa.rest.BaseService;

@Path("/projects")
public class ProjectService extends BaseService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Project> getAllProjects() {
		return factory.getProjectDao().getAllProjects();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Project getProject(@PathParam("id") int id) {
		return factory.getProjectDao().getProject(id);
	}

}
