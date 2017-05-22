package com.kainos.example;

import com.kainos.example.health.ApplicationHealthCheck;
import com.kainos.example.resources.ValueCheckerResource;
import com.kainos.example.services.ValueCheckerService;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ExternalApplication extends Application<ExternalConfiguration> {
    public static void main(String[] args) throws Exception {
        new ExternalApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<ExternalConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(ExternalConfiguration configuration,
                    Environment environment) {
        ValueCheckerService claimChecker = new ValueCheckerService();
        final ValueCheckerResource valueCheckerResource = new ValueCheckerResource(claimChecker);
        environment.jersey().register(valueCheckerResource);

        ApplicationHealthCheck applicationHealthCheck = new ApplicationHealthCheck();
        environment.healthChecks().register("alive", applicationHealthCheck);
    }
}
