/*
 * Copyright 2016-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.joinfaces.richfaces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RichfacesSpringBootAutoConfiguration.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class RichfacesPropertiesIT
{

	@Autowired
	private RichfacesProperties richfacesProperties;

	@Test
	public void testLongValueWithDefault() {
		assertThat(this.richfacesProperties.getLongValueWithDefault()).isEqualTo(-100);
	}

	@Test
	public void testIntValue() {
		assertThat(this.richfacesProperties.getIntValue()).isEqualTo(-1);
	}

	@Test
	public void testIntValueWithDefault() {
		assertThat(this.richfacesProperties.getIntValueWithDefault()).isEqualTo(-1);
	}

	@Test
	public void testStringValue() {
		assertThat(this.richfacesProperties.getStringValue()).isEqualTo("default name");
	}

	@Test
	public void testStringValueWithDefault() {
		assertThat(this.richfacesProperties.getStringValueWithDefault()).isEqualTo("default name 2");
	}

	@Test
	public void testEnumValue() {
		assertThat(this.richfacesProperties.getEnumValue()).isEqualTo("Enum value");
	}

	@Test
	public void testEnumValueWithDefault() {
		assertThat(this.richfacesProperties.getEnumValueWithDefault()).isEqualTo("Enum value with default");
	}

	@Test
	public void testBooleanValue() {
		assertThat(this.richfacesProperties.getBooleanValue()).isTrue();
	}

	@Test
	public void testBooleanValueWithDefault() {
		assertThat(this.richfacesProperties.getBooleanValueWithDefault()).isTrue();
	}

	@Test
	public void testMultiValue1() {
		assertThat(this.richfacesProperties.getMultiValue1()).isEqualTo("Multi1");
	}

	@Test
	public void testMultiValue2() {
		assertThat(this.richfacesProperties.getMultiValue2()).isEqualTo("Multi2");
	}

	@Test
	public void testFacesContextReference() {
		assertThat(this.richfacesProperties.getFacesContextReference()).isEqualTo("Context reference");
	}

	@Test
	public void testDynamicValueWithDefault() {
		assertThat(this.richfacesProperties.getDynamicValueWithDefault()).isEqualTo("Dynamic value");
	}

	@Test
	public void testLiteralOnlyValue() {
		assertThat(this.richfacesProperties.getLiteralOnlyValue()).isEqualTo("Literal only");
	}

	@Test
	public void testLiteralOnlyWithEl() {
		assertThat(this.richfacesProperties.getLiteralOnlyWithEl()).isEqualTo("Literal only with el");
	}

	@Test
	public void testEnableControlSkinning() {
		assertThat(this.richfacesProperties.getEnableControlSkinning()).isTrue();
	}

	@Test
	public void testEnableControlSkinningClasses() {
		assertThat(this.richfacesProperties.getEnableControlSkinningClasses()).isTrue();
	}

	@Test
	public void testSkin() {
		assertThat(this.richfacesProperties.getSkin()).isEqualTo("This is a skin");
	}

	@Test
	public void testBaseSkin() {
		assertThat(this.richfacesProperties.getBaseSkin()).isEqualTo("This is a base skin");
	}

	@Test
	public void testResourceDefaultTTL() {
		assertThat(this.richfacesProperties.getResourceDefaultTTL()).isEqualTo(86400);
	}

	@Test
	public void testResourceCacheSize() {
		assertThat(this.richfacesProperties.getResourceCacheSize()).isEqualTo(111);
	}

	@Test
	public void testResourceDefaultVersion() {
		assertThat(this.richfacesProperties.getResourceDefaultVersion()).isEqualTo("Resource default version");
	}

	@Test
	public void testCacheLruMapCacheSize() {
		assertThat(this.richfacesProperties.getCache().getLruMapCacheSize()).isEqualTo(222);
	}

	@Test
	public void testResourceMappingEnabled() {
		assertThat(this.richfacesProperties.getResourceMapping().getEnabled()).isTrue();
	}

	@Test
	public void testResourceMappingLocation() {
		assertThat(this.richfacesProperties.getResourceMapping().getLocation()).isEqualTo("Location");
	}

	@Test
	public void testResourceMappingMappingFile() {
		assertThat(this.richfacesProperties.getResourceMapping().getMappingFile()).isEqualTo("Mapping file");
	}

	@Test
	public void testResourceMappingCompressedStages() {
		assertThat(this.richfacesProperties.getResourceMapping().getCompressedStages()).isEqualTo("Compressed stages");
	}

	@Test
	public void testResourceMappingPackedStages() {
		assertThat(this.richfacesProperties.getResourceMapping().getPackedStages()).isEqualTo("Packed stages");
	}

	@Test
	public void testResourceOptimizationEnabled() {
		assertThat(this.richfacesProperties.getResourceOptimization().getEnabled()).isTrue();
	}

	@Test
	public void testResourceOptimizationCompressionStages() {
		assertThat(this.richfacesProperties.getResourceOptimization().getCompressionStages()).isEqualTo("Compression stages");
	}

	@Test
	public void testResourceOptimizationPackedStages() {
		assertThat(this.richfacesProperties.getResourceOptimization().getPackedStages()).isEqualTo("Packed stages");
	}

	@Test
	public void testExecuteAWTInitializer() {
		assertThat(this.richfacesProperties.getExecuteAWTInitializer()).isTrue();
	}

	@Test
	public void testPushHandlerMapping() {
		assertThat(this.richfacesProperties.getPush().getHandlerMapping()).isEqualTo("Handler mapping");
	}

	@Test
	public void testPushJmsConnectionFactory() {
		assertThat(this.richfacesProperties.getPush().getJms().getConnectionFactory()).isEqualTo("Connection factory");
	}

	@Test
	public void testPushJmsEnabled() {
		assertThat(this.richfacesProperties.getPush().getJms().getEnabled()).isTrue();
	}

	@Test
	public void testPushJmsTopicsNamespace() {
		assertThat(this.richfacesProperties.getPush().getJms().getTopicsNamespace()).isEqualTo("Topics namespace");
	}

	@Test
	public void testPushJmsConnectionUsername() {
		assertThat(this.richfacesProperties.getPush().getJms().getConnectionUsername()).isEqualTo("Connection username");
	}

	@Test
	public void testPushJmsConnectionPassword() {
		assertThat(this.richfacesProperties.getPush().getJms().getConnectionPassword()).isEqualTo("Connection password");
	}

	@Test
	public void testPushInitializeOnStartup() {
		assertThat(this.richfacesProperties.getPush().getInitializeOnStartup()).isTrue();
	}

	@Test
	public void testPushSessionMaxInactiveInterval() {
		assertThat(this.richfacesProperties.getPush().getSession().getMaxInactiveInterval()).isEqualTo(3000);
	}

	@Test
	public void testBuiltinSortEnabled()
	{
		assertThat(this.richfacesProperties.getBuiltin().getSort().getEnabled()).isTrue();
	}

	@Test
	public void testBuiltinFilterEnabled()
	{
		assertThat(this.richfacesProperties.getBuiltin().getFilter().getEnabled()).isTrue();
	}

	@Test
	public void testQueueEnabled() {
		assertThat(this.richfacesProperties.getQueue().getEnabled()).isTrue();
	}
}
