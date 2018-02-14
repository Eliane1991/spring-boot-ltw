package hello.aspect;

import hello.service.FooService;
import lombok.Value;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Value
public class ExceptionAspect
{
    private FooService fooService;
    
    @AfterThrowing(pointcut = "execution(* *.*(..))", throwing = "throwable")
    public void processError(Throwable throwable)
    {
        fooService.print("Exception was thrown!");
    }
}
