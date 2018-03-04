package mainPackage;

import Java8.LamdaSample;
import beanAndDomain.SampleBean;
import beanAndDomain.SampleDomain;
import beanAndDomain.TestObject;
import com.google.common.collect.Lists;
import java7_using_guava.GuavaSample;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Abhishek on 03/03/18.
 */
public class MainClass {

    public static void main(String[] args) {
        SampleDomain domain1 = buildSampleDomainWithId(10L);
        SampleDomain domain2 = buildSampleDomainWithId(12L);
        SampleDomain domain3 = buildSampleDomainWithId(14L);
        SampleDomain domain4 = buildSampleDomainWithId(16L);

        ArrayList<SampleDomain> sampleDomains = Lists.newArrayList(domain1, domain2, domain3, domain4);

        List<SampleBean> guavaOutput = GuavaSample.processByjava7(sampleDomains);
        List<SampleBean> lamdaOutput = LamdaSample.processByJava8(sampleDomains);
        Set<SampleBean> sampleBeen = GuavaSample.processByUsingHashMultiSet(sampleDomains);

        List<TestObject> testObjectsFromlamda = LamdaSample.useOfAndThenInjava8(sampleDomains);
        List<TestObject> testObjectsfromGuava = GuavaSample.useOfCompose(sampleDomains);


    }

    private static SampleDomain buildSampleDomainWithId(long id) {
        SampleDomain domain1 = new SampleDomain();
        domain1.setId(id);
        domain1.setName("Domain1_Name");
        domain1.setProperty1("property1");
        domain1.setProperty2("property2");
        domain1.setProperty3("property3");
        return domain1;
    }
}
