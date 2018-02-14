package hello.service;

import org.springframework.stereotype.Service;

@Service
public class FooServiceImpl implements FooService
{
    @Override
    public void print(String string)
    {
        System.out.println(string);
    }
}
