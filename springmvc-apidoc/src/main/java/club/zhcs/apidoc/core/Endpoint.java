package club.zhcs.apidoc.core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 调用点信息
 * 
 * @author guiyuan.wang-N
 *
 *         createTime 2016年12月23日下午1:04:00
 *
 */
public class Endpoint {

	private String name;

	private String description;

	private String author;

	private List<RequestMethod> requestMethods = new ArrayList<RequestMethod>();

	private List<Parameter> parameters = new ArrayList<Parameter>();

	private List<Return> returns = new ArrayList<Return>();

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

	public List<RequestMethod> getRequestMethods() {
		return requestMethods;
	}

	public void setRequestMethods(List<RequestMethod> requestMethods) {
		this.requestMethods = requestMethods;
	}

	public List<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}

	public List<Return> getReturns() {
		return returns;
	}

	public void setReturns(List<Return> returns) {
		this.returns = returns;
	}

}
