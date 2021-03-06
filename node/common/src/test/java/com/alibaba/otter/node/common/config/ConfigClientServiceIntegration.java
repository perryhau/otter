/*
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package com.alibaba.otter.node.common.config;

import org.jtester.annotations.SpringBeanByName;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.alibaba.otter.node.common.BaseOtterTest;
import com.alibaba.otter.shared.common.model.config.channel.Channel;
import com.alibaba.otter.shared.common.model.config.node.Node;

public class ConfigClientServiceIntegration extends BaseOtterTest {

    @SpringBeanByName
    private ConfigClientService configClientService;

    @BeforeClass
    public void initial() {
        System.setProperty("nid", "1");
    }

    @Test
    public void test_node() {
        Node cnode = configClientService.currentNode();
        System.out.println(cnode);
        want.bool(cnode.getId() == 1L).is(true);
        Node fnode = configClientService.findNode(2L);
        System.out.println(fnode);
        want.bool(fnode.getId() == 2L);

        fnode = configClientService.findNode(2L);
        System.out.println(fnode);
        want.bool(fnode.getId() == 2L);
    }

    @Test
    public void test_pipeline() {
        Long channelId = 11L;
        Channel channel = configClientService.findChannel(channelId);
        System.out.println(channel);
        want.number(channel.getId()).isEqualTo(channelId);
    }

}
