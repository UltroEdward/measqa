package com.measqa.rest.application;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.measqa.entity.Article;
import com.measqa.rest.BaseService;

@Path("/articles")
public class ArticleService extends BaseService {

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Article getArticle(@PathParam("id") int id) {
		return factory.getArticleDao().getArticle(id);
	}
}