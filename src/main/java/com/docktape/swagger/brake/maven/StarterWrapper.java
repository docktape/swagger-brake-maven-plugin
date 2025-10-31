package com.docktape.swagger.brake.maven;

import java.util.Collection;

import com.docktape.swagger.brake.core.BreakingChange;
import com.docktape.swagger.brake.runner.Options;
import com.docktape.swagger.brake.runner.Starter;

public class StarterWrapper {
    public Collection<BreakingChange> start(Options options) {
        return Starter.start(options);
    }
}
