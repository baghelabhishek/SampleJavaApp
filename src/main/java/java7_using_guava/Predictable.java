package java7_using_guava;

import beanAndDomain.SampleDomain;
import com.google.common.base.Predicate;

/**
 * Created by Abhishek on 03/03/18.
 */
 class Predictable implements Predicate<SampleDomain> {

    private static final int COMPARING_VALUE = 23;

    @Override
    public boolean apply(SampleDomain sampleDomain) {
        return sampleDomain.getId() > COMPARING_VALUE;

    }
}
