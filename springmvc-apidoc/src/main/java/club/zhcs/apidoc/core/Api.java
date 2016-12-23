package club.zhcs.apidoc.core;

import java.util.ArrayList;
import java.util.List;

/**
 * api 对象
 * 
 * @author guiyuan.wang-N
 *
 *         createTime 2016年12月23日下午12:58:04
 *
 */
public class Api {

	/**
	 * 标题
	 */
	private final String title;
	/**
	 * 描述
	 */
	private final String description;
	/**
	 * 服务条款地址
	 */
	private final String termsOfServiceUrl;
	/**
	 * 联系信息
	 */
	private final String contact;
	/**
	 * 授权协议
	 */
	private final String license;
	/**
	 * 协议地址
	 */
	private final String licenseUrl;
	/**
	 * API 分组列表
	 */
	private List<Group> groups = new ArrayList<Group>();

	public Api(String title, String description, String termsOfServiceUrl, String contact, String license, String licenseUrl) {
		this.title = title;
		this.description = description;
		this.termsOfServiceUrl = termsOfServiceUrl;
		this.contact = contact;
		this.license = license;
		this.licenseUrl = licenseUrl;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public String getTitle() {
		return this.title;
	}

	public String getDescription() {
		return this.description;
	}

	public String getTermsOfServiceUrl() {
		return this.termsOfServiceUrl;
	}

	public String getContact() {
		return this.contact;
	}

	public String getLicense() {
		return this.license;
	}

	public String getLicenseUrl() {
		return this.licenseUrl;
	}

}
