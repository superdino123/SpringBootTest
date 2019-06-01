package com.diplant.springawaretest;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
	
	private String beanName;
	private ResourceLoader loader;
	
	
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.loader = resourceLoader;
	}


	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	public void outputResult() {
		System.out.println("Bean的名称为： " + beanName);
		Resource resource = loader.getResource("classpath:com/diplant/springawaretest/test.txt");
		
		try {
			System.out.println("ResourceLoader 加载的文件内容为: " + 
					IOUtils.toString(resource.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
