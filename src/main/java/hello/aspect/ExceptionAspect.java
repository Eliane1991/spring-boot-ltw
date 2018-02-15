package hello.aspect;

import hello.service.FooService;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
public class ExceptionAspect
{
    @Autowired
    private FooService fooService;
    
    @AfterThrowing(pointcut = "execution(* *.*(..)) && !within(is(FinalType))", throwing = "throwable")
    public void processError(Throwable throwable)
    {
        fooService.print("Exception was thrown!");
    }
}
