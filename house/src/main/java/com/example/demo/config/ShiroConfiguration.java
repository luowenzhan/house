package com.example.demo.config;

import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.session.mgt.eis.JavaUuidSessionIdGenerator;
import org.apache.shiro.session.mgt.eis.MemorySessionDAO;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.realm.UserRealm;

import javax.servlet.Filter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfiguration {
	/**
	 * ShiroFilterFactoryBean 处理拦截资源文件问题。 注意：单独一个ShiroFilterFactoryBean配置是或报错的，以为在
	 * 初始化ShiroFilterFactoryBean的时候需要注入：SecurityManager Filter Chain定义说明
	 * 1、一个URL可以配置多个Filter，使用逗号分隔 2、当设置多个过滤器时，全部验证通过，才视为通过 3、部分过滤器可指定参数，如perms，roles
	 */
	@Bean
	public ShiroFilterFactoryBean shirFilter(org.apache.shiro.mgt.SecurityManager securityManager) {
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();

// 必须设置 SecurityManager
		shiroFilterFactoryBean.setSecurityManager(securityManager);

// 拦截器.
		Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
//配置静态资源允许访问
		filterChainDefinitionMap.put("/login.html", "anon");
		filterChainDefinitionMap.put("/login/**", "anon");
		filterChainDefinitionMap.put("/lib/**", "anon");
		filterChainDefinitionMap.put("/js/**", "anon");
		filterChainDefinitionMap.put("/message/**", "anon");
		filterChainDefinitionMap.put("/static/**", "anon");
		filterChainDefinitionMap.put("/temp/**", "anon");
//		filterChainDefinitionMap.put("/api/auth/loginAction", "anon");
		/* 设置权限过滤器 */
		
//		  filterChainDefinitionMap.put("/userManage/**", "perms[系统用户管理]"); 
//		  filterChainDefinitionMap.put("/resident/**", "perms[住户管理]"); 
//		  filterChainDefinitionMap.put("/house/**", "perms[房屋管理]"); 
//		  filterChainDefinitionMap.put("/facility/**", "perms[物业设备管理]"); 
//		  filterChainDefinitionMap.put("/park/**", "perms[停车场管理]"); 
//		  filterChainDefinitionMap.put("/charge/**", "perms[物业收费管理]"); 
//		  filterChainDefinitionMap.put("/complain/**", "perms[住户投诉管理]"); 
//		  filterChainDefinitionMap.put("/warranty/**", "perms[住户保修管理]"); 
//		  filterChainDefinitionMap.put("/personnel/**", "perms[人事管理]");
//		  filterChainDefinitionMap.put("/roleManage/**", "perms[角色管理]");
//		  filterChainDefinitionMap.put("/permissionManage/**", "perms[权限管理]");
//		  filterChainDefinitionMap.put("/rolepermission/**", "perms[角色权限管理]");
		  
//        filterChainDefinitionMap.put("/module/**", "perms[用户管理]");
//        filterChainDefinitionMap.put("/module/**", "perms[角色管理]");
// <!-- authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问-->
//		filterChainDefinitionMap.put("/**", "authc");
// 如果不设置默认会自动寻找Web工程根目录下的"/login.jsp"页面
		shiroFilterFactoryBean.setLoginUrl("/login.html");
// 未授权界面;
		shiroFilterFactoryBean.setUnauthorizedUrl("/login/noauth");
		Map<String, Filter> filters = new HashMap<String, Filter>();
		shiroFilterFactoryBean.setFilters(filters);
		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
		return shiroFilterFactoryBean;
	}

	@Bean
	public EhCacheManager getEhCacheManager() {
		EhCacheManager em = new EhCacheManager();
		em.setCacheManagerConfigFile("classpath:ehcache-shiro.xml");
		return em;
	}

	// 开启Controller中的shiro注解
	@Bean
	public DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {
		DefaultAdvisorAutoProxyCreator daap = new DefaultAdvisorAutoProxyCreator();
		daap.setProxyTargetClass(true);
		return daap;
	}

	/**
	 * 配置org.apache.shiro.web.session.mgt.DefaultWebSessionManager
	 * 
	 * @return
	 */
	@Bean
	public DefaultWebSessionManager getDefaultWebSessionManager() {
		DefaultWebSessionManager defaultWebSessionManager = new DefaultWebSessionManager();
		defaultWebSessionManager.setSessionDAO(getMemorySessionDAO());
		defaultWebSessionManager.setGlobalSessionTimeout(4200000);
		defaultWebSessionManager.setSessionValidationSchedulerEnabled(true);
		defaultWebSessionManager.setSessionIdCookieEnabled(true);
		defaultWebSessionManager.setSessionIdCookie(getSimpleCookie());
		return defaultWebSessionManager;
	}

	/**
	 * 配置org.apache.shiro.session.mgt.eis.MemorySessionDAO
	 * 
	 * @return
	 */
	@Bean
	public MemorySessionDAO getMemorySessionDAO() {
		MemorySessionDAO memorySessionDAO = new MemorySessionDAO();
		memorySessionDAO.setSessionIdGenerator(javaUuidSessionIdGenerator());
		return memorySessionDAO;
	}

	@Bean
	public JavaUuidSessionIdGenerator javaUuidSessionIdGenerator() {
		return new JavaUuidSessionIdGenerator();
	}

	/**
	 * session自定义cookie名
	 * 
	 * @return
	 */
	@Bean
	public SimpleCookie getSimpleCookie() {
		SimpleCookie simpleCookie = new SimpleCookie();
		simpleCookie.setName("security.session.id");
		simpleCookie.setPath("/");
		return simpleCookie;
	}

	@Bean
	public LifecycleBeanPostProcessor getLifecycleBeanPostProcessor() {
		return new LifecycleBeanPostProcessor();
	}

	@Bean(name = "securityManager")
	// securityManager引用缓存管理器
	public DefaultWebSecurityManager getDefaultWebSecurityManager(UserRealm userRealm) {
		DefaultWebSecurityManager dwsm = new DefaultWebSecurityManager();
		dwsm.setRealm(userRealm);
		// <!-- 用户授权/认证信息Cache, 采用EhCache 缓存 -->
		dwsm.setCacheManager(getEhCacheManager());
		dwsm.setSessionManager(getDefaultWebSessionManager());
		return dwsm;
	}

	@Bean
	public UserRealm userRealm() {
		UserRealm userRealm = new UserRealm();
//        userRealm.setCacheManager(cacheManager);
		return userRealm;
	}

	/**
	 * 开启shrio注解支持
	 * 
	 * @param userRealm
	 * @return
	 */
	@Bean
	public AuthorizationAttributeSourceAdvisor getAuthorizationAttributeSourceAdvisor(UserRealm userRealm) {
		AuthorizationAttributeSourceAdvisor aasa = new AuthorizationAttributeSourceAdvisor();
		aasa.setSecurityManager(getDefaultWebSecurityManager(userRealm));
		return aasa;
	}
}
