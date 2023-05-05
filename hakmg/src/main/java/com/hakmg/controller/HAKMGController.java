package com.hakmg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.hakmg.service.HAKMGService;

@RestController
public class HAKMGController {
@Autowired
HAKMGService haserv;
}
