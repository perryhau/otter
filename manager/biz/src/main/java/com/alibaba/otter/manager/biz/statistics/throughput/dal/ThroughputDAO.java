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

package com.alibaba.otter.manager.biz.statistics.throughput.dal;

import java.util.List;

import com.alibaba.otter.manager.biz.statistics.throughput.dal.dataobject.ThroughputStatDO;
import com.alibaba.otter.manager.biz.statistics.throughput.param.RealtimeThroughputCondition;
import com.alibaba.otter.manager.biz.statistics.throughput.param.ThroughputCondition;
import com.alibaba.otter.manager.biz.statistics.throughput.param.TimelineThroughputCondition;

/**
 * @author simon
 */
public interface ThroughputDAO {

    public void insertThroughputStat(ThroughputStatDO throughputStat);

    public void deleteThroughputStat(Long throughputStatId);

    public void modifyThroughputStat(ThroughputStatDO throughputStat);

    public ThroughputStatDO findThroughputStatById(Long throughputStatId);

    public List<ThroughputStatDO> listRealtimeThroughputStat(RealtimeThroughputCondition condition);

    public List<ThroughputStatDO> listTimelineThroughputStat(TimelineThroughputCondition condition);

    public ThroughputStatDO findRealtimeThroughputStat(ThroughputCondition condition);

    public List<ThroughputStatDO> listThroughputStatByPipelineId(Long pipelineId);

    public List<ThroughputStatDO> listRealTimeThroughputStatByPipelineIds(List<Long> pipelineIds, int minute);
}
