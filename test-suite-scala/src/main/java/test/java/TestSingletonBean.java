package test.java;

import javax.inject.Singleton;

@Singleton
public class TestSingletonBean {
    public String getNotInjected() {
        return "not injected";
    }
}