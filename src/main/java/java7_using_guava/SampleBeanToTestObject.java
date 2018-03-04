package java7_using_guava;

import beanAndDomain.SampleBean;
import beanAndDomain.TestObject;
import com.google.common.base.Function;

/**
 * Created by Abhishek on 04/03/18.
 */
 class SampleBeanToTestObject implements Function<SampleBean,TestObject> {

    @Override
    public TestObject apply(SampleBean sampleBean) {
        TestObject object = new TestObject();
        object.setId(sampleBean.getId());
        object.setProperty1(sampleBean.getProperty1());
        object.setProperty2(sampleBean.getProperty2());
        return object;
    }
}
