package club.zhcs.apidoc.core;

/**
 * 请求参数信息
 * 
 * @author guiyuan.wang-N
 *
 *         createTime 2016年12月23日下午1:06:38
 *
 */
public class Parameter {

	private String name;

	private String description;

	private String defaultValue;

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

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

}
