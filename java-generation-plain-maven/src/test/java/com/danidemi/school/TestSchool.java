package com.danidemi.school;

import com.danidemi.protobuf.Training;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class TestSchool {

    @Test
    public void shouldUseShool() {

        Training.Course build = Training.Course.newBuilder()
                .addStudent(Training.Student.newBuilder().setEmail("john@john.com"))
                .build();

        assertTrue( true );

    }

}
