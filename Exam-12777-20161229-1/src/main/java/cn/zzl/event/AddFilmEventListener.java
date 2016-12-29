package cn.zzl.event;


import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;


@Component("AddFilmEventListener")
public class AddFilmEventListener implements ApplicationListener{
	@Override
	public void onApplicationEvent(ApplicationEvent applicationEvent) {
		if(applicationEvent instanceof ContextStartedEvent) {
			System.out.println("Context Start");
		}else if(applicationEvent instanceof ContextClosedEvent){
			System.out.println("Context Stop");
		}
	}
}
