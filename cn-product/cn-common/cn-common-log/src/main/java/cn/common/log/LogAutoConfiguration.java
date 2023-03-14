package cn.common.log;


import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 日志自动配置
 */
@EnableAsync
@Configuration
@AllArgsConstructor
@ConditionalOnWebApplication
public class LogAutoConfiguration {
//	private final RemoteLogService remoteLogService;
//
//	@Bean
//	public SysLogListener sysLogListener() {
//		return new SysLogListener(remoteLogService);
//	}

//	@Bean
//	public SysLogAspect sysLogAspect(ApplicationEventPublisher publisher) {
//		return new SysLogAspect(publisher);
//	}
}
