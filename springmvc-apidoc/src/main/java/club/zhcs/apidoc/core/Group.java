package club.zhcs.apidoc.core;

import java.util.ArrayList;
import java.util.List;

/**
 * api 分组信息
 * 
 * @author guiyuan.wang-N
 *
 *         createTime 2016年12月23日下午1:00:27
 *
 */
public class Group {

	private String name;

	private String description;

	private String author;

	private String path;

	private List<Endpoint> endpoints = new ArrayList<Endpoint>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<Endpoint> getEndpoints() {
		return endpoints;
	}

	public void setEndpoints(List<Endpoint> endpoints) {
		this.endpoints = endpoints;
	}

}
