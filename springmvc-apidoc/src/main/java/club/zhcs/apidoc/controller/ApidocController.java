package club.zhcs.apidoc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Maps;

import club.zhcs.apidoc.anno.ApiIgnore;

@ApiIgnore
@RestController
public class ApidocController {

	@RequestMapping("/_/")
	public Object test() {
		return Maps.newConcurrentMap();
	}

}
