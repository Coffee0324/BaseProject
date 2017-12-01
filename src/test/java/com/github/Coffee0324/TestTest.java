package com.github.Coffee0324;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestTest {
    @Test
    public void getType() throws Exception {
        // Arrange
        test triangle = new test(5, 10, 5);

        // Act
        String result = triangle.getType();

        // Assert
        Assert.assertEquals("不是三角形", result);
    }

}
