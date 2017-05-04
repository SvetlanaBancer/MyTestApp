package org.softpost;

import org.testng.annotations.Test;

import java.util.Map;
import java.util.Properties;

/**
 * Unit test for simple App.
 */
public class AppTest2 {
    @Test(groups = {"sanity","smoke"})
    public static void test1(){
        System.out.println("Test1");
        
        Map<String, String> env1 = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                    envName,
                    env.get(envName));
        }
//System.out.println("TeamCity build name " + System.getenv("build_number"));
       // org.apache.log4j.Logger.getLogger(DriverUtil.class).info(":: PlanName :: " + System.getenv("bamboo_planName"));
System.out.println("*****************************************System properties*****************************************");
Properties props = System.getProperties();
props.list(System.out);

    }

    @Test
    public static void test2(){
        System.out.println("Test2");
    }
}
