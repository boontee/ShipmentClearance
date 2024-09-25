package org.acme.cc_approval.service;

import org.acme.cc_approval.model.*;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LogService {
    public void log(String msg) {
        System.out.println("************* Log");
        System.out.println(""+ msg);
        System.out.println("************* Log");
    }
}
