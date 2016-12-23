package club.zhcs.apidoc.core;

/**
 * 返回数据
 * 
 * @author guiyuan.wang-N
 *
 *         createTime 2016年12月23日下午1:35:26
 *
 */
public class Return {

	private String key;

	private String description;

	private Class clazz;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Class getClazz() {
		return clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

}
