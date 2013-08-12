package com.alibaba.otter.shared.arbitrate;

import com.alibaba.otter.shared.arbitrate.impl.setl.ExtractArbitrateEvent;
import com.alibaba.otter.shared.arbitrate.impl.setl.LoadArbitrateEvent;
import com.alibaba.otter.shared.arbitrate.impl.setl.MainStemArbitrateEvent;
import com.alibaba.otter.shared.arbitrate.impl.setl.SelectArbitrateEvent;
import com.alibaba.otter.shared.arbitrate.impl.setl.TerminArbitrateEvent;
import com.alibaba.otter.shared.arbitrate.impl.setl.ToolArbitrateEvent;
import com.alibaba.otter.shared.arbitrate.impl.setl.TransformArbitrateEvent;

/**
 * 仲裁器事件处理的service，使用者可关注相应的await/single两个方法
 * 
 * @author jianghang 2011-8-9 下午04:39:49
 */
public interface ArbitrateEventService {

    public MainStemArbitrateEvent mainStemEvent();

    public SelectArbitrateEvent selectEvent();

    public ExtractArbitrateEvent extractEvent();

    public TransformArbitrateEvent transformEvent();

    public LoadArbitrateEvent loadEvent();

    public TerminArbitrateEvent terminEvent();

    public ToolArbitrateEvent toolEvent();
}