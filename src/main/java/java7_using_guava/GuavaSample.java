package java7_using_guava;

import beanAndDomain.SampleBean;
import beanAndDomain.SampleDomain;
import beanAndDomain.TestObject;
import com.google.common.base.Functions;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Set;

/**
 * Created by Abhishek on 03/03/18.
 */
public class GuavaSample {

    public static List<SampleBean> processByjava7(List<SampleDomain> sampleDomains){
       return FluentIterable.from(sampleDomains)
                .filter(new Predictable())
                .transform(new SampleDomainToBean())
                .toList();
    }

    public static List<TestObject> useOfCompose(List<SampleDomain> sampleDomains){
        return Lists.transform(sampleDomains,
                Functions.
                        compose(new SampleBeanToTestObject(),new SampleDomainToBean() ));
    }


    public static Set<SampleBean> processByUsingHashMultiSet(List<SampleDomain> sampleDomains){
        HashMultiset<SampleBean> sampleBean = HashMultiset.create(
                Iterables.transform
                        (Iterables.filter(sampleDomains, new Predictable()), new SampleDomainToBean()));
        return sampleBean.elementSet();
    }
}
