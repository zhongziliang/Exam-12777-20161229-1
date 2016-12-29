package cn.zzl.service.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


/**
 * Created by ZZL on 2016/12/29.
 */
@Aspect
@Component
public class UserTimeEachMethod {
    @Before("execution(* cn.zzl.service.IInsertFilmMsgService.*(..))")
    public void beforeMethod(){
        System.out.println("Before Insert Film Data");
    }

    @After("execution(* cn.zzl.service.*.*(..))")
    public void afterMethod(){
        System.out.println("After Insert Film Data");
    }
}
