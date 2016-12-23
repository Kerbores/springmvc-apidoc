package club.zhcs.apidoc.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 被apidoc忽略的内容,可以是类,方法或者参数
 * 
 * @author guiyuan.wang-N
 *
 *         createTime 2016年12月23日下午12:45:44
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({
		java.lang.annotation.ElementType.METHOD,
		java.lang.annotation.ElementType.TYPE,
		java.lang.annotation.ElementType.PARAMETER })
public @interface ApiIgnore {

}
