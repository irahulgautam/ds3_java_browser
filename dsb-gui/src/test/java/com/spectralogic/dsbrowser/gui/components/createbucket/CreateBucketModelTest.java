package com.spectralogic.dsbrowser.gui.components.createbucket;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class CreateBucketModelTest {
    @Test
    public void getInitializedDataPolicy() throws Exception {
        final CreateBucketModel value = new CreateBucketModel();
        assertThat(value.getDataPolicy(), is(""));
    }

    @Test
    public void getDataPolicy() throws Exception {
        final CreateBucketModel value = new CreateBucketModel("fake",null);
        assertThat(value.getDataPolicy(), is("fake"));
    }

}