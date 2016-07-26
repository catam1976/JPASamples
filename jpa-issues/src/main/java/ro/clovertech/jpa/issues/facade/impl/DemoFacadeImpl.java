package ro.clovertech.jpa.issues.facade.impl;

import org.apache.log4j.Logger;

import ro.clovertech.jpa.issues.facade.DemoFacade;

/**
 * JPA sampler demo.
 * @author catam1976
 *
 */
public class DemoFacadeImpl implements DemoFacade {
    private static final Logger LOGGER = Logger.getLogger(DemoFacadeImpl.class);

    @Override
    public void start(String demoId) {
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info(String.format("JPA Sampler demo started with [%s] ", demoId));
        }
    }

}
