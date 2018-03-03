package java7_using_guava;

import beanAndDomain.SampleBean;
import beanAndDomain.SampleDomain;
import com.google.common.collect.FluentIterable;

import java.util.List;

/**
 * Created by Abhishek on 03/03/18.
 */
public class GuavaSample {

    public static List<SampleBean> processByjava7(List<SampleDomain> sampleDomains){
       return FluentIterable.from(sampleDomains)
                .filter(new Predictable())
                .transform(new Functionable())
                .toList();
    }
}
