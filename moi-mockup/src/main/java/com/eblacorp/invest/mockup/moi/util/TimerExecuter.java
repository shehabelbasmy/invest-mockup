package com.eblacorp.invest.mockup.moi.util;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimerExecuter {

	public static void executeAfter(Runnable task) {
		ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        scheduler.schedule(task, 10, TimeUnit.SECONDS);

        scheduler.shutdown();
	}
}
