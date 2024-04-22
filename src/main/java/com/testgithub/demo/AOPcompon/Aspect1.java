package com.testgithub.demo.AOPcompon;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspect1 {
    @Pointcut("execution(* com.testgithub.demo.controller.UserController.Hellouser())")
    public void Aspect1PointCut(){

}
@After(value = "Aspect1PointCut()")
    public void OutName(){
        System.out.println("AOP组件注入");
}

}
