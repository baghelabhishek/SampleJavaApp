package java7_using_guava;

import beanAndDomain.SampleBean;
import beanAndDomain.SampleDomain;
import com.google.common.base.Function;

/**
 * Created by Abhishek on 03/03/18.
 */
 class SampleDomainToBean implements Function<SampleDomain, SampleBean> {

    @Override
    public SampleBean apply(SampleDomain sampleDomain) {

        SampleBean sampleBean = new SampleBean();
        sampleBean.setId(sampleDomain.getId());
        sampleBean.setName(sampleDomain.getName());
        sampleBean.setProperty1(sampleDomain.getProperty1());
        sampleBean.setProperty2(sampleDomain.getProperty2());
        sampleBean.setProperty3(sampleDomain.getProperty3());
        return sampleBean;
    }
}
