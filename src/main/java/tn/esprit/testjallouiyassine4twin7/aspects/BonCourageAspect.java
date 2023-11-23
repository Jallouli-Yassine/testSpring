package tn.esprit.testjallouiyassine4twin7.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BonCourageAspect {
    @Pointcut("execution(* tn.esprit.testjallouiyassine4twin7.services..get*(..))")
    private void allGetMethodsInServices() {}

    @After("allGetMethodsInServices()")
    public void afterGetMethods() {
        System.out.println("Bon courage !");
    }
}
