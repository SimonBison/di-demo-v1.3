package com.gmail.spbisoft.didemo;

import com.gmail.spbisoft.didemo.controllers.ConstructorInjectedController;
import com.gmail.spbisoft.didemo.controllers.MyController;
import com.gmail.spbisoft.didemo.controllers.PropertyInjectedController;
import com.gmail.spbisoft.didemo.controllers.SetterInjectedController;
import com.gmail.spbisoft.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());
    }
}
