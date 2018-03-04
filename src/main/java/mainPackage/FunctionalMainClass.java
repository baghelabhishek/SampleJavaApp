package mainPackage;

import Java8.LamdaSample;
import beanAndDomain.SampleBean;
import beanAndDomain.SampleDomain;
import beanAndDomain.TestObject;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java7_using_guava.GuavaSample;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Abhishek on 03/03/18.
 */
public class FunctionalMainClass {

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

        List<SampleDomain> sampleDomainsFromLamda = LamdaSample.useOfIdentityFunction(sampleDomains);
        ImmutableList<List<SampleDomain>> listImmutableList = GuavaSample.useOfConstant(sampleDomains);


    }

    private static SampleDomain buildSampleDomainWithId(long id) {
        SampleDomain sampleDomain = new SampleDomain();
        sampleDomain.setId(id);
        sampleDomain.setName("Domain1_Name");
        sampleDomain.setProperty1("property1");
        sampleDomain.setProperty2("property2");
        sampleDomain.setProperty3("property3");
        return sampleDomain;
    }
}
