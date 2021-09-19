package com.Kurumsal.Kurumsal.core.concretes;

import com.Kurumsal.Kurumsal.core.abstracts.LoggerService;
import com.Kurumsal.Kurumsal.jLogger.JLoggerManager;

public class JloggerManagerAdapter implements LoggerService {
    @Override
    public void logToSystem(String msg) {
        JLoggerManager manager=new JLoggerManager();
        manager.log(msg);
    }
}
