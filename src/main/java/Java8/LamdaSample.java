package Java8;

import beanAndDomain.SampleBean;
import beanAndDomain.SampleDomain;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Abhishek on 03/03/18.
 */
public class LamdaSample {

    private static final int COMPARING_VALUE = 23;

    public static List<SampleBean> processByJava8(List<SampleDomain> sampleDomains){

       return sampleDomains.stream()
                .filter(e -> e.getId() > COMPARING_VALUE)
                .map(mapDomainToBeanObject())
                .collect(Collectors.toList());
    }

    private static Function<SampleDomain, SampleBean> mapDomainToBeanObject() {
        return e -> {
            SampleBean sampleBean = new SampleBean();
            sampleBean.setId(e.getId());
            sampleBean.setName(e.getName());
            sampleBean.setProperty1(e.getProperty1());
            sampleBean.setProperty2(e.getProperty2());
            sampleBean.setProperty3(e.getProperty3());
            return sampleBean;
        };
    }
}
