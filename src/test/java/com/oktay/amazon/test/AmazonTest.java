package com.oktay.amazon.test;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

import com.oktay.amazon.base.BaseTest;

/**
 * @author oktay
 *
 */
public class AmazonTest extends BaseTest {

	@Test
	public void successLoginTest() {

		assertThat("frodo").isEqualTo("frodo");
		assertThat("frodo").isNotEqualTo("sauron");
	}

}
