package com.testgithub.demo.AOPcompon;


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
@Before(value = "Aspect1PointCut()&& args(name)")
    public void OutName(String name){
        System.out.println("Hellouser之前 OUTNAME："+name);
}




}
